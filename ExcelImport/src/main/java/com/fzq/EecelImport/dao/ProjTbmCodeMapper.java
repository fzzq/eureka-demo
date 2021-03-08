package com.fzq.EecelImport.dao;

import com.fzq.EecelImport.entity.ProjTbmCode;
import com.fzq.EecelImport.entity.ProjTbmCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjTbmCodeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProjTbmCode record);

    int insertSelective(ProjTbmCode record);

    List<ProjTbmCode> selectByExample(ProjTbmCodeExample example);

    ProjTbmCode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProjTbmCode record, @Param("example") ProjTbmCodeExample example);

    int updateByExample(@Param("record") ProjTbmCode record, @Param("example") ProjTbmCodeExample example);

    int updateByPrimaryKeySelective(ProjTbmCode record);

    int updateByPrimaryKey(ProjTbmCode record);
}