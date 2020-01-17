package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameJdbUsers;
import com.Test.model.DBmodel.GameJdbUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameJdbUsersMapper {
    long countByExample(GameJdbUsersExample example);

    int deleteByExample(GameJdbUsersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameJdbUsers record);

    int insertSelective(GameJdbUsers record);

    List<GameJdbUsers> selectByExample(GameJdbUsersExample example);

    GameJdbUsers selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameJdbUsers record, @Param("example") GameJdbUsersExample example);

    int updateByExample(@Param("record") GameJdbUsers record, @Param("example") GameJdbUsersExample example);

    int updateByPrimaryKeySelective(GameJdbUsers record);

    int updateByPrimaryKey(GameJdbUsers record);
}