package com.fzq.EecelImport.controller;

import com.fzq.EecelImport.common.utils.JacksonUtils;
import com.fzq.EecelImport.entity.TbmCodeGlobal;
import com.fzq.EecelImport.service.TbmCodeClassService;
import com.fzq.EecelImport.service.TbmCodeGlobalService;
import org.elasticsearch.action.bulk.BulkRequestBuilder;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.action.index.IndexRequestBuilder;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
public class EsController {
    @Autowired
    private TransportClient transportClient;


    @Autowired
    private TbmCodeGlobalService tbmCodeGlobalService;

    @RequestMapping("/addIndex")
    @ResponseBody
    public String addIndex() {


        List<TbmCodeGlobal> list = tbmCodeGlobalService.findAll();


        //批处理类
        BulkRequestBuilder bulkRequestBuilder = transportClient.prepareBulk();
        //插入方法
        //jyplatform 代表index   理解为数据库中的库
        //prisoner   代表type   理解为数据库总的表
        //UUID  个人理解是为数据库中的主键
        int i = 0;
        for (TbmCodeGlobal tb : list) {


            IndexRequestBuilder indexRequestBuilder = transportClient.
                    prepareIndex("param_name2", "_doc", "instanceid_" + tb.getId().toString())
                    .setSource(
                            "id_code", tb.getId(),
                            "rootName", tb.getRootName(),
                            "name", tb.getName(),
                            "code", tb.getCode(),
                            "unit", tb.getUnit(),
                            "ttm1", tb.getTtm1(),
                            "ttm2", tb.getTtm2(),
                            "ttm3", tb.getTtm3(),
                            "ttm4", tb.getTtm4(),
                            "ttm5", tb.getTtm5(),
                            "preCode", tb.getPreCode(),
                            "preName", tb.getPreName(),
                            "remark", tb.getRemark()
                    );
            i++;
            bulkRequestBuilder.add(indexRequestBuilder);

        }
        BulkResponse bulkItemResponses = bulkRequestBuilder.execute().actionGet();
        System.out.println(bulkItemResponses.getTook());


        return "";
    }


    public Object addEs() {

        //要插入的数据
        List<Map<String, Object>> prisonerListList = new ArrayList<>();
        //批处理类
        BulkRequestBuilder bulkRequestBuilder = transportClient.prepareBulk();
        int count = 0;
        for (Map<String, Object> prisoner : prisonerListList) {

            //插入方法
            //jyplatform 代表index   理解为数据库中的库
            //prisoner   代表type   理解为数据库总的表
            //UUID  个人理解是为数据库中的主键
            String uuid = UUID.randomUUID().toString().replace("-", "");
            IndexRequestBuilder indexRequestBuilder = transportClient.
                    prepareIndex("jyplatform", "prisoner", uuid)
                    .setSource(prisoner);
            //单个执行
            //IndexResponse indexResponse = indexRequestBuilder.get();

            //批量执行 将添加器加入批处理中
            bulkRequestBuilder.add(indexRequestBuilder);
            if (count % 5000 == 0) {
                //每隔5000条执行一次批量插入的操作
                BulkResponse bulkItemResponses = bulkRequestBuilder.execute().actionGet();
                System.err.println(bulkItemResponses.getTook());
                float num = (float) count / prisonerListList.size();
                DecimalFormat df = new DecimalFormat("0.00");
                String s = df.format(num * 100);
                System.err.println("================================" + s + "%");
            }
            count++;
        }
        return prisonerListList;
    }


}
