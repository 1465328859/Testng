package com.Test.model.DBmodel;

import com.Test.model.DBmodel.LeopardTest;

public interface LeopardTestMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LeopardTest record);

    int insertSelective(LeopardTest record);

    LeopardTest selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LeopardTest record);

    int updateByPrimaryKey(LeopardTest record);
}