package com.Test.model.DBmodel;

import com.Test.model.DBmodel.UsersOnline;

public interface UsersOnlineMapper {
    int deleteByPrimaryKey(Integer onlineId);

    int insert(UsersOnline record);

    int insertSelective(UsersOnline record);

    UsersOnline selectByPrimaryKey(Integer onlineId);

    int updateByPrimaryKeySelective(UsersOnline record);

    int updateByPrimaryKey(UsersOnline record);
}