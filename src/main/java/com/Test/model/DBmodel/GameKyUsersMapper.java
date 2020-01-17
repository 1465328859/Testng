package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameKyUsers;
import com.Test.model.DBmodel.GameKyUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameKyUsersMapper {
    long countByExample(GameKyUsersExample example);

    int deleteByExample(GameKyUsersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameKyUsers record);

    int insertSelective(GameKyUsers record);

    List<GameKyUsers> selectByExample(GameKyUsersExample example);

    GameKyUsers selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameKyUsers record, @Param("example") GameKyUsersExample example);

    int updateByExample(@Param("record") GameKyUsers record, @Param("example") GameKyUsersExample example);

    int updateByPrimaryKeySelective(GameKyUsers record);

    int updateByPrimaryKey(GameKyUsers record);
}