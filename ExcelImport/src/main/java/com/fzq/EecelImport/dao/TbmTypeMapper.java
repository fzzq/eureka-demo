package com.fzq.EecelImport.dao;

import com.fzq.EecelImport.entity.TbmType;
import com.fzq.EecelImport.entity.TbmTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbmTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbmType record);

    int insertSelective(TbmType record);

    List<TbmType> selectByExample(TbmTypeExample example);

    TbmType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbmType record, @Param("example") TbmTypeExample example);

    int updateByExample(@Param("record") TbmType record, @Param("example") TbmTypeExample example);

    int updateByPrimaryKeySelective(TbmType record);

    int updateByPrimaryKey(TbmType record);
}