package com.Test.model.DBmodel;

import com.Test.model.DBmodel.UsersExtDesc;

public interface UsersExtDescMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UsersExtDesc record);

    int insertSelective(UsersExtDesc record);

    UsersExtDesc selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UsersExtDesc record);

    int updateByPrimaryKey(UsersExtDesc record);
}