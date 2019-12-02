package com.Test.model.DBmodel;

import com.Test.model.DBmodel.UsersMsg;

public interface UsersMsgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UsersMsg record);

    int insertSelective(UsersMsg record);

    UsersMsg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UsersMsg record);

    int updateByPrimaryKeyWithBLOBs(UsersMsg record);

    int updateByPrimaryKey(UsersMsg record);
}