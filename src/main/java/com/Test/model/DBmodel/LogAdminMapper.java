package com.Test.model.DBmodel;

import com.Test.model.DBmodel.LogAdmin;

public interface LogAdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LogAdmin record);

    int insertSelective(LogAdmin record);

    LogAdmin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LogAdmin record);

    int updateByPrimaryKeyWithBLOBs(LogAdmin record);

    int updateByPrimaryKey(LogAdmin record);
}