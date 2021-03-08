package com.fzq.EecelImport.dao;

import com.fzq.EecelImport.entity.TbmCodeAddr;
import com.fzq.EecelImport.entity.TbmCodeAddrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbmCodeAddrMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbmCodeAddr record);

    int insertSelective(TbmCodeAddr record);

    List<TbmCodeAddr> selectByExample(TbmCodeAddrExample example);

    TbmCodeAddr selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbmCodeAddr record, @Param("example") TbmCodeAddrExample example);

    int updateByExample(@Param("record") TbmCodeAddr record, @Param("example") TbmCodeAddrExample example);

    int updateByPrimaryKeySelective(TbmCodeAddr record);

    int updateByPrimaryKey(TbmCodeAddr record);
}