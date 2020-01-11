package com.Test.model.DBmodel;

import com.Test.model.DBmodel.TaskDeposit;
import com.Test.model.DBmodel.TaskDepositExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskDepositMapper {
    long countByExample(TaskDepositExample example);

    int deleteByExample(TaskDepositExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TaskDeposit record);

    int insertSelective(TaskDeposit record);

    List<TaskDeposit> selectByExample(TaskDepositExample example);

    TaskDeposit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TaskDeposit record, @Param("example") TaskDepositExample example);

    int updateByExample(@Param("record") TaskDeposit record, @Param("example") TaskDepositExample example);

    int updateByPrimaryKeySelective(TaskDeposit record);

    int updateByPrimaryKey(TaskDeposit record);
}