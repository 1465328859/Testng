package com.Test.model.DBmodel;

import com.Test.model.DBmodel.LogAdmin;
import com.Test.model.DBmodel.LogAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogAdminMapper {
    long countByExample(LogAdminExample example);

    int deleteByExample(LogAdminExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LogAdmin record);

    int insertSelective(LogAdmin record);

    List<LogAdmin> selectByExampleWithBLOBs(LogAdminExample example);

    List<LogAdmin> selectByExample(LogAdminExample example);

    LogAdmin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LogAdmin record, @Param("example") LogAdminExample example);

    int updateByExampleWithBLOBs(@Param("record") LogAdmin record, @Param("example") LogAdminExample example);

    int updateByExample(@Param("record") LogAdmin record, @Param("example") LogAdminExample example);

    int updateByPrimaryKeySelective(LogAdmin record);

    int updateByPrimaryKeyWithBLOBs(LogAdmin record);

    int updateByPrimaryKey(LogAdmin record);
}