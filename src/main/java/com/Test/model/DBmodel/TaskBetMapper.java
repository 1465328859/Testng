package com.Test.model.DBmodel;

import com.Test.model.DBmodel.TaskBet;

public interface TaskBetMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TaskBet record);

    int insertSelective(TaskBet record);

    TaskBet selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TaskBet record);

    int updateByPrimaryKey(TaskBet record);
}