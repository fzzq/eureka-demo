package com.fzq.EecelImport.dao;

import com.fzq.EecelImport.entity.TbmCodeClass;

public interface TbmCodeClassMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbmCodeClass record);

    int insertSelective(TbmCodeClass record);

    TbmCodeClass selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbmCodeClass record);

    int updateByPrimaryKey(TbmCodeClass record);
}