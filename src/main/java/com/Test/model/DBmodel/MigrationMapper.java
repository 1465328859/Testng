package com.Test.model.DBmodel;

import com.Test.model.DBmodel.Migration;
import com.Test.model.DBmodel.MigrationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MigrationMapper {
    long countByExample(MigrationExample example);

    int deleteByExample(MigrationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Migration record);

    int insertSelective(Migration record);

    List<Migration> selectByExample(MigrationExample example);

    Migration selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Migration record, @Param("example") MigrationExample example);

    int updateByExample(@Param("record") Migration record, @Param("example") MigrationExample example);

    int updateByPrimaryKeySelective(Migration record);

    int updateByPrimaryKey(Migration record);
}