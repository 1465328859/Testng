package com.Test.model.DBmodel;

import com.Test.model.DBmodel.RptKill;

public interface RptKillMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RptKill record);

    int insertSelective(RptKill record);

    RptKill selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RptKill record);

    int updateByPrimaryKey(RptKill record);
}