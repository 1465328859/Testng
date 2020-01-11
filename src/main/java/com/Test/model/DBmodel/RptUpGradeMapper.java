package com.Test.model.DBmodel;

import com.Test.model.DBmodel.RptUpGrade;
import com.Test.model.DBmodel.RptUpGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RptUpGradeMapper {
    long countByExample(RptUpGradeExample example);

    int deleteByExample(RptUpGradeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RptUpGrade record);

    int insertSelective(RptUpGrade record);

    List<RptUpGrade> selectByExample(RptUpGradeExample example);

    RptUpGrade selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RptUpGrade record, @Param("example") RptUpGradeExample example);

    int updateByExample(@Param("record") RptUpGrade record, @Param("example") RptUpGradeExample example);

    int updateByPrimaryKeySelective(RptUpGrade record);

    int updateByPrimaryKey(RptUpGrade record);
}