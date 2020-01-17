package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameMgUsers;
import com.Test.model.DBmodel.GameMgUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameMgUsersMapper {
    long countByExample(GameMgUsersExample example);

    int deleteByExample(GameMgUsersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameMgUsers record);

    int insertSelective(GameMgUsers record);

    List<GameMgUsers> selectByExample(GameMgUsersExample example);

    GameMgUsers selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameMgUsers record, @Param("example") GameMgUsersExample example);

    int updateByExample(@Param("record") GameMgUsers record, @Param("example") GameMgUsersExample example);

    int updateByPrimaryKeySelective(GameMgUsers record);

    int updateByPrimaryKey(GameMgUsers record);
}