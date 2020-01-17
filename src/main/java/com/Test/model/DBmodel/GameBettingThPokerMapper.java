package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameBettingThPoker;
import com.Test.model.DBmodel.GameBettingThPokerExample;
import com.Test.model.DBmodel.GameBettingThPokerKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameBettingThPokerMapper {
    long countByExample(GameBettingThPokerExample example);

    int deleteByExample(GameBettingThPokerExample example);

    int deleteByPrimaryKey(GameBettingThPokerKey key);

    int insert(GameBettingThPoker record);

    int insertSelective(GameBettingThPoker record);

    List<GameBettingThPoker> selectByExample(GameBettingThPokerExample example);

    GameBettingThPoker selectByPrimaryKey(GameBettingThPokerKey key);

    int updateByExampleSelective(@Param("record") GameBettingThPoker record, @Param("example") GameBettingThPokerExample example);

    int updateByExample(@Param("record") GameBettingThPoker record, @Param("example") GameBettingThPokerExample example);

    int updateByPrimaryKeySelective(GameBettingThPoker record);

    int updateByPrimaryKey(GameBettingThPoker record);
}