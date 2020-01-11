package com.Test.model.DBmodel;

import com.Test.model.DBmodel.TaskBet;
import com.Test.model.DBmodel.TaskBetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskBetMapper {
    long countByExample(TaskBetExample example);

    int deleteByExample(TaskBetExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TaskBet record);

    int insertSelective(TaskBet record);

    List<TaskBet> selectByExample(TaskBetExample example);

    TaskBet selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TaskBet record, @Param("example") TaskBetExample example);

    int updateByExample(@Param("record") TaskBet record, @Param("example") TaskBetExample example);

    int updateByPrimaryKeySelective(TaskBet record);

    int updateByPrimaryKey(TaskBet record);
}