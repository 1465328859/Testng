package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameBettingKyPoker;
import com.Test.model.DBmodel.GameBettingKyPokerExample;
import com.Test.model.DBmodel.GameBettingKyPokerKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameBettingKyPokerMapper {
    long countByExample(GameBettingKyPokerExample example);

    int deleteByExample(GameBettingKyPokerExample example);

    int deleteByPrimaryKey(GameBettingKyPokerKey key);

    int insert(GameBettingKyPoker record);

    int insertSelective(GameBettingKyPoker record);

    List<GameBettingKyPoker> selectByExample(GameBettingKyPokerExample example);

    GameBettingKyPoker selectByPrimaryKey(GameBettingKyPokerKey key);

    int updateByExampleSelective(@Param("record") GameBettingKyPoker record, @Param("example") GameBettingKyPokerExample example);

    int updateByExample(@Param("record") GameBettingKyPoker record, @Param("example") GameBettingKyPokerExample example);

    int updateByPrimaryKeySelective(GameBettingKyPoker record);

    int updateByPrimaryKey(GameBettingKyPoker record);
}