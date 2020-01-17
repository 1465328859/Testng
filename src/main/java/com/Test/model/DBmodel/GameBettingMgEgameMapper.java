package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameBettingMgEgame;
import com.Test.model.DBmodel.GameBettingMgEgameExample;
import com.Test.model.DBmodel.GameBettingMgEgameKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameBettingMgEgameMapper {
    long countByExample(GameBettingMgEgameExample example);

    int deleteByExample(GameBettingMgEgameExample example);

    int deleteByPrimaryKey(GameBettingMgEgameKey key);

    int insert(GameBettingMgEgame record);

    int insertSelective(GameBettingMgEgame record);

    List<GameBettingMgEgame> selectByExample(GameBettingMgEgameExample example);

    GameBettingMgEgame selectByPrimaryKey(GameBettingMgEgameKey key);

    int updateByExampleSelective(@Param("record") GameBettingMgEgame record, @Param("example") GameBettingMgEgameExample example);

    int updateByExample(@Param("record") GameBettingMgEgame record, @Param("example") GameBettingMgEgameExample example);

    int updateByPrimaryKeySelective(GameBettingMgEgame record);

    int updateByPrimaryKey(GameBettingMgEgame record);
}