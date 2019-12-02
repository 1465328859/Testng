package com.Test.model.DBmodel;

import com.Test.model.DBmodel.Migration;

public interface MigrationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Migration record);

    int insertSelective(Migration record);

    Migration selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Migration record);

    int updateByPrimaryKey(Migration record);
}