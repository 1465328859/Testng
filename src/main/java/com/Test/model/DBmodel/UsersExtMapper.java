package com.Test.model.DBmodel;

import com.Test.model.DBmodel.UsersExt;

public interface UsersExtMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UsersExt record);

    int insertSelective(UsersExt record);

    UsersExt selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UsersExt record);

    int updateByPrimaryKey(UsersExt record);
}