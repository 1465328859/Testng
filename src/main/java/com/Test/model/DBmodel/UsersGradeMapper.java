package com.Test.model.DBmodel;

import com.Test.model.DBmodel.UsersGrade;

public interface UsersGradeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UsersGrade record);

    int insertSelective(UsersGrade record);

    UsersGrade selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UsersGrade record);

    int updateByPrimaryKey(UsersGrade record);
}