package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameGjUsers;
import com.Test.model.DBmodel.GameGjUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameGjUsersMapper {
    long countByExample(GameGjUsersExample example);

    int deleteByExample(GameGjUsersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameGjUsers record);

    int insertSelective(GameGjUsers record);

    List<GameGjUsers> selectByExample(GameGjUsersExample example);

    GameGjUsers selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameGjUsers record, @Param("example") GameGjUsersExample example);

    int updateByExample(@Param("record") GameGjUsers record, @Param("example") GameGjUsersExample example);

    int updateByPrimaryKeySelective(GameGjUsers record);

    int updateByPrimaryKey(GameGjUsers record);
}