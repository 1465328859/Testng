package com.Test.model.DBmodel;

import com.Test.model.DBmodel.RptGradePresent;

public interface RptGradePresentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RptGradePresent record);

    int insertSelective(RptGradePresent record);

    RptGradePresent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RptGradePresent record);

    int updateByPrimaryKey(RptGradePresent record);
}