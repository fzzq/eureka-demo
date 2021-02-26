package com.fzq.EecelImport.controller;

import com.fzq.EecelImport.entity.SimilarTest;
import com.fzq.EecelImport.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @ResponseBody
    @RequestMapping("/test")
    public String getHellow(){
        List<SimilarTest > all =testService.findAll();

        return all.toString();
    }
}
