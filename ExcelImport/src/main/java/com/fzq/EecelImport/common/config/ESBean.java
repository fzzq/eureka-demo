package com.fzq.EecelImport.common.config;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.net.InetAddress;

/***
 ** 配置ES,支持集群
 */
@Configuration
public class ESBean {


    @Value("${elasticsearch.host}")
    private String esHost;

    @Value("${elasticsearch.port}")
    private int esPort;

    @Value("${elasticsearch.clusterName}")
    private String esClusterName;

    private TransportClient client;

    @PostConstruct
    public void initialize() throws Exception {
        Settings esSettings = Settings.builder()
                .put("cluster.name", esClusterName)
                .put("client.transport.sniff", true).build();
        client = new PreBuiltTransportClient(esSettings);

        String[] esHosts = esHost.trim().split(",");
        for (String host : esHosts) {

            TransportAddress transportAddress = new TransportAddress(InetAddress.getByName(esHost), esPort);
            client.addTransportAddress(transportAddress);
        }
    }

    @Bean
    public TransportClient client() {
        return client;
    }


    @PreDestroy
    public void destroy() {
        if (client != null) {
            client.close();
        }
    }
}



