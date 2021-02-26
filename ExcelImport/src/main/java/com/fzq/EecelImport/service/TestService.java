package com.fzq.EecelImport.service;

import com.fzq.EecelImport.dao.SimilarTestMapper;
import com.fzq.EecelImport.entity.SimilarTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    private SimilarTestMapper mapper;

    public List<SimilarTest> findAll() {
        return  mapper.selectAll();
    }
}
