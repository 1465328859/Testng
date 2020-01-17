package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameMgGames;
import com.Test.model.DBmodel.GameMgGamesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameMgGamesMapper {
    long countByExample(GameMgGamesExample example);

    int deleteByExample(GameMgGamesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameMgGames record);

    int insertSelective(GameMgGames record);

    List<GameMgGames> selectByExample(GameMgGamesExample example);

    GameMgGames selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameMgGames record, @Param("example") GameMgGamesExample example);

    int updateByExample(@Param("record") GameMgGames record, @Param("example") GameMgGamesExample example);

    int updateByPrimaryKeySelective(GameMgGames record);

    int updateByPrimaryKey(GameMgGames record);
}