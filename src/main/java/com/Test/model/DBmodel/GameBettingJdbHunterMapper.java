package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameBettingJdbHunter;
import com.Test.model.DBmodel.GameBettingJdbHunterExample;
import com.Test.model.DBmodel.GameBettingJdbHunterKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameBettingJdbHunterMapper {
    long countByExample(GameBettingJdbHunterExample example);

    int deleteByExample(GameBettingJdbHunterExample example);

    int deleteByPrimaryKey(GameBettingJdbHunterKey key);

    int insert(GameBettingJdbHunter record);

    int insertSelective(GameBettingJdbHunter record);

    List<GameBettingJdbHunter> selectByExample(GameBettingJdbHunterExample example);

    GameBettingJdbHunter selectByPrimaryKey(GameBettingJdbHunterKey key);

    int updateByExampleSelective(@Param("record") GameBettingJdbHunter record, @Param("example") GameBettingJdbHunterExample example);

    int updateByExample(@Param("record") GameBettingJdbHunter record, @Param("example") GameBettingJdbHunterExample example);

    int updateByPrimaryKeySelective(GameBettingJdbHunter record);

    int updateByPrimaryKey(GameBettingJdbHunter record);
}