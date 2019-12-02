package com.Test.model.DBmodel;

import com.Test.model.DBmodel.TaskDeposit;

public interface TaskDepositMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TaskDeposit record);

    int insertSelective(TaskDeposit record);

    TaskDeposit selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TaskDeposit record);

    int updateByPrimaryKey(TaskDeposit record);
}