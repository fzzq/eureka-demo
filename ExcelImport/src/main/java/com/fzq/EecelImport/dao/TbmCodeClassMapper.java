package com.fzq.EecelImport.dao;

import com.fzq.EecelImport.entity.TbmCodeClass;
import com.fzq.EecelImport.entity.TbmCodeClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbmCodeClassMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbmCodeClass record);

    int insertSelective(TbmCodeClass record);

    List<TbmCodeClass> selectByExample(TbmCodeClassExample example);

    TbmCodeClass selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbmCodeClass record, @Param("example") TbmCodeClassExample example);

    int updateByExample(@Param("record") TbmCodeClass record, @Param("example") TbmCodeClassExample example);

    int updateByPrimaryKeySelective(TbmCodeClass record);

    int updateByPrimaryKey(TbmCodeClass record);
}