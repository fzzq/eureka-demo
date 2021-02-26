package com.fzq.EecelImport.dao;

import com.fzq.EecelImport.entity.SimilarTest;

import java.util.List;

public interface SimilarTestMapper  {
    int deleteByPrimaryKey(Integer id);

    int insert(SimilarTest record);

    int insertSelective(SimilarTest record);

    SimilarTest selectByPrimaryKey(Integer id);
    List<SimilarTest> selectAll();

    int updateByPrimaryKeySelective(SimilarTest record);

    int updateByPrimaryKey(SimilarTest record);
}