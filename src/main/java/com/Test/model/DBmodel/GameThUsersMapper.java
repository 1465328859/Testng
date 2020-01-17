package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameThUsers;
import com.Test.model.DBmodel.GameThUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameThUsersMapper {
    long countByExample(GameThUsersExample example);

    int deleteByExample(GameThUsersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameThUsers record);

    int insertSelective(GameThUsers record);

    List<GameThUsers> selectByExample(GameThUsersExample example);

    GameThUsers selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameThUsers record, @Param("example") GameThUsersExample example);

    int updateByExample(@Param("record") GameThUsers record, @Param("example") GameThUsersExample example);

    int updateByPrimaryKeySelective(GameThUsers record);

    int updateByPrimaryKey(GameThUsers record);
}