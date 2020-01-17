package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameJdbGames;
import com.Test.model.DBmodel.GameJdbGamesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameJdbGamesMapper {
    long countByExample(GameJdbGamesExample example);

    int deleteByExample(GameJdbGamesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameJdbGames record);

    int insertSelective(GameJdbGames record);

    List<GameJdbGames> selectByExample(GameJdbGamesExample example);

    GameJdbGames selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameJdbGames record, @Param("example") GameJdbGamesExample example);

    int updateByExample(@Param("record") GameJdbGames record, @Param("example") GameJdbGamesExample example);

    int updateByPrimaryKeySelective(GameJdbGames record);

    int updateByPrimaryKey(GameJdbGames record);
}