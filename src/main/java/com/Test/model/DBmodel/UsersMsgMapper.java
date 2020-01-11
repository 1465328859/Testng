package com.Test.model.DBmodel;

import com.Test.model.DBmodel.UsersMsg;
import com.Test.model.DBmodel.UsersMsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersMsgMapper {
    long countByExample(UsersMsgExample example);

    int deleteByExample(UsersMsgExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UsersMsg record);

    int insertSelective(UsersMsg record);

    List<UsersMsg> selectByExampleWithBLOBs(UsersMsgExample example);

    List<UsersMsg> selectByExample(UsersMsgExample example);

    UsersMsg selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UsersMsg record, @Param("example") UsersMsgExample example);

    int updateByExampleWithBLOBs(@Param("record") UsersMsg record, @Param("example") UsersMsgExample example);

    int updateByExample(@Param("record") UsersMsg record, @Param("example") UsersMsgExample example);

    int updateByPrimaryKeySelective(UsersMsg record);

    int updateByPrimaryKeyWithBLOBs(UsersMsg record);

    int updateByPrimaryKey(UsersMsg record);
}