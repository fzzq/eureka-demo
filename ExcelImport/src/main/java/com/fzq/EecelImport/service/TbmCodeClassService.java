package com.fzq.EecelImport.service;

import com.fzq.EecelImport.dao.TbmCodeClassMapper;
import com.fzq.EecelImport.entity.TbmCodeClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TbmCodeClassService {

    @Autowired
    private TbmCodeClassMapper dao;


    public int save(TbmCodeClass tbmCodeClass) {
        return  dao.insertSelective(tbmCodeClass);
    }
}
