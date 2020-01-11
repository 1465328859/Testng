package com.Test.model.DBmodel;

import com.Test.model.DBmodel.LogUsers;
import com.Test.model.DBmodel.LogUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogUsersMapper {
    long countByExample(LogUsersExample example);

    int deleteByExample(LogUsersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LogUsers record);

    int insertSelective(LogUsers record);

    List<LogUsers> selectByExampleWithBLOBs(LogUsersExample example);

    List<LogUsers> selectByExample(LogUsersExample example);

    LogUsers selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LogUsers record, @Param("example") LogUsersExample example);

    int updateByExampleWithBLOBs(@Param("record") LogUsers record, @Param("example") LogUsersExample example);

    int updateByExample(@Param("record") LogUsers record, @Param("example") LogUsersExample example);

    int updateByPrimaryKeySelective(LogUsers record);

    int updateByPrimaryKeyWithBLOBs(LogUsers record);

    int updateByPrimaryKey(LogUsers record);
}