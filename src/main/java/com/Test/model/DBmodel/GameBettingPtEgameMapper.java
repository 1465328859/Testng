package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameBettingPtEgame;
import com.Test.model.DBmodel.GameBettingPtEgameExample;
import com.Test.model.DBmodel.GameBettingPtEgameKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameBettingPtEgameMapper {
    long countByExample(GameBettingPtEgameExample example);

    int deleteByExample(GameBettingPtEgameExample example);

    int deleteByPrimaryKey(GameBettingPtEgameKey key);

    int insert(GameBettingPtEgame record);

    int insertSelective(GameBettingPtEgame record);

    List<GameBettingPtEgame> selectByExample(GameBettingPtEgameExample example);

    GameBettingPtEgame selectByPrimaryKey(GameBettingPtEgameKey key);

    int updateByExampleSelective(@Param("record") GameBettingPtEgame record, @Param("example") GameBettingPtEgameExample example);

    int updateByExample(@Param("record") GameBettingPtEgame record, @Param("example") GameBettingPtEgameExample example);

    int updateByPrimaryKeySelective(GameBettingPtEgame record);

    int updateByPrimaryKey(GameBettingPtEgame record);
}