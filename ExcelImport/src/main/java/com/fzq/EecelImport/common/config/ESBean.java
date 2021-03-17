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
        Settings settings = Settings.builder()
                .put("cluster.name", "my-application").put("client.transport.sniff", true).build();



         client = new PreBuiltTransportClient(settings)
                .addTransportAddress(new TransportAddress(InetAddress.getByName("10.53.221.111"), 9300));
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



