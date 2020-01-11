package com.Test.model.DBmodel;

import com.Test.model.DBmodel.UsersGrade;
import com.Test.model.DBmodel.UsersGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersGradeMapper {
    long countByExample(UsersGradeExample example);

    int deleteByExample(UsersGradeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UsersGrade record);

    int insertSelective(UsersGrade record);

    List<UsersGrade> selectByExample(UsersGradeExample example);

    UsersGrade selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UsersGrade record, @Param("example") UsersGradeExample example);

    int updateByExample(@Param("record") UsersGrade record, @Param("example") UsersGradeExample example);

    int updateByPrimaryKeySelective(UsersGrade record);

    int updateByPrimaryKey(UsersGrade record);
}