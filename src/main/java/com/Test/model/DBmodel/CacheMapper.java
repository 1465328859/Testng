package com.Test.model.DBmodel;

import com.Test.model.DBmodel.Cache;
import com.Test.model.DBmodel.CacheExample;
import com.Test.model.DBmodel.CacheWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CacheMapper {
    long countByExample(CacheExample example);

    int deleteByExample(CacheExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CacheWithBLOBs record);

    int insertSelective(CacheWithBLOBs record);

    List<CacheWithBLOBs> selectByExampleWithBLOBs(CacheExample example);

    List<Cache> selectByExample(CacheExample example);

    CacheWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CacheWithBLOBs record, @Param("example") CacheExample example);

    int updateByExampleWithBLOBs(@Param("record") CacheWithBLOBs record, @Param("example") CacheExample example);

    int updateByExample(@Param("record") Cache record, @Param("example") CacheExample example);

    int updateByPrimaryKeySelective(CacheWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CacheWithBLOBs record);

    int updateByPrimaryKey(Cache record);
}