package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameBgUsers;
import com.Test.model.DBmodel.GameBgUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameBgUsersMapper {
    long countByExample(GameBgUsersExample example);

    int deleteByExample(GameBgUsersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameBgUsers record);

    int insertSelective(GameBgUsers record);

    List<GameBgUsers> selectByExample(GameBgUsersExample example);

    GameBgUsers selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameBgUsers record, @Param("example") GameBgUsersExample example);

    int updateByExample(@Param("record") GameBgUsers record, @Param("example") GameBgUsersExample example);

    int updateByPrimaryKeySelective(GameBgUsers record);

    int updateByPrimaryKey(GameBgUsers record);
}