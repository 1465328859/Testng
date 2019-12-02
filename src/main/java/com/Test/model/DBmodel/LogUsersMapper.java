package com.Test.model.DBmodel;

import com.Test.model.DBmodel.LogUsers;

public interface LogUsersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LogUsers record);

    int insertSelective(LogUsers record);

    LogUsers selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LogUsers record);

    int updateByPrimaryKeyWithBLOBs(LogUsers record);

    int updateByPrimaryKey(LogUsers record);
}