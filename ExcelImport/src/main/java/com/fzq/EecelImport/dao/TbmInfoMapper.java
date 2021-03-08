package com.fzq.EecelImport.dao;

import com.fzq.EecelImport.entity.TbmInfo;
import com.fzq.EecelImport.entity.TbmInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbmInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbmInfo record);

    int insertSelective(TbmInfo record);

    List<TbmInfo> selectByExample(TbmInfoExample example);

    TbmInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbmInfo record, @Param("example") TbmInfoExample example);

    int updateByExample(@Param("record") TbmInfo record, @Param("example") TbmInfoExample example);

    int updateByPrimaryKeySelective(TbmInfo record);

    int updateByPrimaryKey(TbmInfo record);
}