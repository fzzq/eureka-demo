package com.fzq.EecelImport.dao;

import com.fzq.EecelImport.entity.SimilarTest;
import com.fzq.EecelImport.entity.SimilarTestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SimilarTestMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SimilarTest record);

    int insertSelective(SimilarTest record);

    List<SimilarTest> selectByExample(SimilarTestExample example);

    SimilarTest selectByPrimaryKey(Integer id);
    List<SimilarTest> selectAll();

    int updateByPrimaryKeySelective(SimilarTest record);

    int updateByPrimaryKey(SimilarTest record);
}