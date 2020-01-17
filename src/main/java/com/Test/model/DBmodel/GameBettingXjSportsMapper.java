package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameBettingXjSports;
import com.Test.model.DBmodel.GameBettingXjSportsExample;
import com.Test.model.DBmodel.GameBettingXjSportsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameBettingXjSportsMapper {
    long countByExample(GameBettingXjSportsExample example);

    int deleteByExample(GameBettingXjSportsExample example);

    int deleteByPrimaryKey(GameBettingXjSportsKey key);

    int insert(GameBettingXjSports record);

    int insertSelective(GameBettingXjSports record);

    List<GameBettingXjSports> selectByExample(GameBettingXjSportsExample example);

    GameBettingXjSports selectByPrimaryKey(GameBettingXjSportsKey key);

    int updateByExampleSelective(@Param("record") GameBettingXjSports record, @Param("example") GameBettingXjSportsExample example);

    int updateByExample(@Param("record") GameBettingXjSports record, @Param("example") GameBettingXjSportsExample example);

    int updateByPrimaryKeySelective(GameBettingXjSports record);

    int updateByPrimaryKey(GameBettingXjSports record);
}