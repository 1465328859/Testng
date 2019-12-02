package com.Test.model.DBmodel;

import com.Test.model.DBmodel.TaskCheck;

public interface TaskCheckMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TaskCheck record);

    int insertSelective(TaskCheck record);

    TaskCheck selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TaskCheck record);

    int updateByPrimaryKey(TaskCheck record);
}