package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameKyGames;
import com.Test.model.DBmodel.GameKyGamesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameKyGamesMapper {
    long countByExample(GameKyGamesExample example);

    int deleteByExample(GameKyGamesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameKyGames record);

    int insertSelective(GameKyGames record);

    List<GameKyGames> selectByExample(GameKyGamesExample example);

    GameKyGames selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameKyGames record, @Param("example") GameKyGamesExample example);

    int updateByExample(@Param("record") GameKyGames record, @Param("example") GameKyGamesExample example);

    int updateByPrimaryKeySelective(GameKyGames record);

    int updateByPrimaryKey(GameKyGames record);
}