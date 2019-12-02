package com.Test.model.DBmodel;

import com.Test.model.DBmodel.Cache;
import com.Test.model.DBmodel.CacheWithBLOBs;

public interface CacheMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CacheWithBLOBs record);

    int insertSelective(CacheWithBLOBs record);

    CacheWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CacheWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CacheWithBLOBs record);

    int updateByPrimaryKey(Cache record);
}