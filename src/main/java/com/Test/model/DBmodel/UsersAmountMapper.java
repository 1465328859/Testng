package com.Test.model.DBmodel;

import com.Test.model.DBmodel.UsersAmount;

public interface UsersAmountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UsersAmount record);

    int insertSelective(UsersAmount record);

    UsersAmount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UsersAmount record);

    int updateByPrimaryKey(UsersAmount record);
}