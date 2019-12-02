package com.Test.model.DBmodel;

import com.Test.model.DBmodel.RptUpGrade;

public interface RptUpGradeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RptUpGrade record);

    int insertSelective(RptUpGrade record);

    RptUpGrade selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RptUpGrade record);

    int updateByPrimaryKey(RptUpGrade record);
}