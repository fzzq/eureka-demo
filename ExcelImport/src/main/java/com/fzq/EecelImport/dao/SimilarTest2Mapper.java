package com.fzq.EecelImport.dao;

import com.fzq.EecelImport.entity.SimilarTest2;
import com.fzq.EecelImport.entity.SimilarTest2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SimilarTest2Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SimilarTest2 record);

    int insertSelective(SimilarTest2 record);

    List<SimilarTest2> selectByExample(SimilarTest2Example example);

    SimilarTest2 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SimilarTest2 record, @Param("example") SimilarTest2Example example);

    int updateByExample(@Param("record") SimilarTest2 record, @Param("example") SimilarTest2Example example);

    int updateByPrimaryKeySelective(SimilarTest2 record);

    int updateByPrimaryKey(SimilarTest2 record);
}