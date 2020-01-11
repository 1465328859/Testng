package com.Test.model.DBmodel;

import com.Test.model.DBmodel.TaskCheck;
import com.Test.model.DBmodel.TaskCheckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskCheckMapper {
    long countByExample(TaskCheckExample example);

    int deleteByExample(TaskCheckExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TaskCheck record);

    int insertSelective(TaskCheck record);

    List<TaskCheck> selectByExample(TaskCheckExample example);

    TaskCheck selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TaskCheck record, @Param("example") TaskCheckExample example);

    int updateByExample(@Param("record") TaskCheck record, @Param("example") TaskCheckExample example);

    int updateByPrimaryKeySelective(TaskCheck record);

    int updateByPrimaryKey(TaskCheck record);
}