package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameThGames;
import com.Test.model.DBmodel.GameThGamesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameThGamesMapper {
    long countByExample(GameThGamesExample example);

    int deleteByExample(GameThGamesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameThGames record);

    int insertSelective(GameThGames record);

    List<GameThGames> selectByExample(GameThGamesExample example);

    GameThGames selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameThGames record, @Param("example") GameThGamesExample example);

    int updateByExample(@Param("record") GameThGames record, @Param("example") GameThGamesExample example);

    int updateByPrimaryKeySelective(GameThGames record);

    int updateByPrimaryKey(GameThGames record);
}