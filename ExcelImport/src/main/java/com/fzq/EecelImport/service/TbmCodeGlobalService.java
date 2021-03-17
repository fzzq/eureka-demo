package com.fzq.EecelImport.service;

import com.fzq.EecelImport.dao.TbmCodeGlobalMapper;
import com.fzq.EecelImport.entity.TbmCodeGlobal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbmCodeGlobalService {

    @Autowired
    private TbmCodeGlobalMapper dao ;


    public List<TbmCodeGlobal> findAll() {
        List<TbmCodeGlobal> tbmCodeGlobals = dao.selectByExample(null);
        return tbmCodeGlobals;


    }
}
