package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GamePtGames;
import com.Test.model.DBmodel.GamePtGamesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GamePtGamesMapper {
    long countByExample(GamePtGamesExample example);

    int deleteByExample(GamePtGamesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GamePtGames record);

    int insertSelective(GamePtGames record);

    List<GamePtGames> selectByExample(GamePtGamesExample example);

    GamePtGames selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GamePtGames record, @Param("example") GamePtGamesExample example);

    int updateByExample(@Param("record") GamePtGames record, @Param("example") GamePtGamesExample example);

    int updateByPrimaryKeySelective(GamePtGames record);

    int updateByPrimaryKey(GamePtGames record);
}