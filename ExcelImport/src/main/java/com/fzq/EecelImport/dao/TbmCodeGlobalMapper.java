package com.fzq.EecelImport.dao;

import com.fzq.EecelImport.entity.TbmCodeGlobal;
import com.fzq.EecelImport.entity.TbmCodeGlobalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbmCodeGlobalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbmCodeGlobal record);

    int insertSelective(TbmCodeGlobal record);

    List<TbmCodeGlobal> selectByExampleWithBLOBs(TbmCodeGlobalExample example);

    List<TbmCodeGlobal> selectByExample(TbmCodeGlobalExample example);

    TbmCodeGlobal selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbmCodeGlobal record, @Param("example") TbmCodeGlobalExample example);

    int updateByExampleWithBLOBs(@Param("record") TbmCodeGlobal record, @Param("example") TbmCodeGlobalExample example);

    int updateByExample(@Param("record") TbmCodeGlobal record, @Param("example") TbmCodeGlobalExample example);

    int updateByPrimaryKeySelective(TbmCodeGlobal record);

    int updateByPrimaryKeyWithBLOBs(TbmCodeGlobal record);

    int updateByPrimaryKey(TbmCodeGlobal record);
}