package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameBettingGjSports;
import com.Test.model.DBmodel.GameBettingGjSportsExample;
import com.Test.model.DBmodel.GameBettingGjSportsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameBettingGjSportsMapper {
    long countByExample(GameBettingGjSportsExample example);

    int deleteByExample(GameBettingGjSportsExample example);

    int deleteByPrimaryKey(GameBettingGjSportsKey key);

    int insert(GameBettingGjSports record);

    int insertSelective(GameBettingGjSports record);

    List<GameBettingGjSports> selectByExample(GameBettingGjSportsExample example);

    GameBettingGjSports selectByPrimaryKey(GameBettingGjSportsKey key);

    int updateByExampleSelective(@Param("record") GameBettingGjSports record, @Param("example") GameBettingGjSportsExample example);

    int updateByExample(@Param("record") GameBettingGjSports record, @Param("example") GameBettingGjSportsExample example);

    int updateByPrimaryKeySelective(GameBettingGjSports record);

    int updateByPrimaryKey(GameBettingGjSports record);
}