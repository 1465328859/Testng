package com.Test.model.DBmodel;

import com.Test.model.DBmodel.UsersOnline;
import com.Test.model.DBmodel.UsersOnlineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersOnlineMapper {
    long countByExample(UsersOnlineExample example);

    int deleteByExample(UsersOnlineExample example);

    int deleteByPrimaryKey(Integer onlineId);

    int insert(UsersOnline record);

    int insertSelective(UsersOnline record);

    List<UsersOnline> selectByExample(UsersOnlineExample example);

    UsersOnline selectByPrimaryKey(Integer onlineId);

    int updateByExampleSelective(@Param("record") UsersOnline record, @Param("example") UsersOnlineExample example);

    int updateByExample(@Param("record") UsersOnline record, @Param("example") UsersOnlineExample example);

    int updateByPrimaryKeySelective(UsersOnline record);

    int updateByPrimaryKey(UsersOnline record);
}