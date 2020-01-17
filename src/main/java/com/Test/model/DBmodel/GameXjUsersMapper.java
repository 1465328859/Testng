package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameXjUsers;
import com.Test.model.DBmodel.GameXjUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameXjUsersMapper {
    long countByExample(GameXjUsersExample example);

    int deleteByExample(GameXjUsersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameXjUsers record);

    int insertSelective(GameXjUsers record);

    List<GameXjUsers> selectByExample(GameXjUsersExample example);

    GameXjUsers selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameXjUsers record, @Param("example") GameXjUsersExample example);

    int updateByExample(@Param("record") GameXjUsers record, @Param("example") GameXjUsersExample example);

    int updateByPrimaryKeySelective(GameXjUsers record);

    int updateByPrimaryKey(GameXjUsers record);
}