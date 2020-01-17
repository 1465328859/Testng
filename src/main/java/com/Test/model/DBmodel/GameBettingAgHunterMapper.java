package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameBettingAgHunter;
import com.Test.model.DBmodel.GameBettingAgHunterExample;
import com.Test.model.DBmodel.GameBettingAgHunterKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameBettingAgHunterMapper {
    long countByExample(GameBettingAgHunterExample example);

    int deleteByExample(GameBettingAgHunterExample example);

    int deleteByPrimaryKey(GameBettingAgHunterKey key);

    int insert(GameBettingAgHunter record);

    int insertSelective(GameBettingAgHunter record);

    List<GameBettingAgHunter> selectByExample(GameBettingAgHunterExample example);

    GameBettingAgHunter selectByPrimaryKey(GameBettingAgHunterKey key);

    int updateByExampleSelective(@Param("record") GameBettingAgHunter record, @Param("example") GameBettingAgHunterExample example);

    int updateByExample(@Param("record") GameBettingAgHunter record, @Param("example") GameBettingAgHunterExample example);

    int updateByPrimaryKeySelective(GameBettingAgHunter record);

    int updateByPrimaryKey(GameBettingAgHunter record);
}