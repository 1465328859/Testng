package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameBettingAgVideo;
import com.Test.model.DBmodel.GameBettingAgVideoExample;
import com.Test.model.DBmodel.GameBettingAgVideoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameBettingAgVideoMapper {
    long countByExample(GameBettingAgVideoExample example);

    int deleteByExample(GameBettingAgVideoExample example);

    int deleteByPrimaryKey(GameBettingAgVideoKey key);

    int insert(GameBettingAgVideo record);

    int insertSelective(GameBettingAgVideo record);

    List<GameBettingAgVideo> selectByExample(GameBettingAgVideoExample example);

    GameBettingAgVideo selectByPrimaryKey(GameBettingAgVideoKey key);

    int updateByExampleSelective(@Param("record") GameBettingAgVideo record, @Param("example") GameBettingAgVideoExample example);

    int updateByExample(@Param("record") GameBettingAgVideo record, @Param("example") GameBettingAgVideoExample example);

    int updateByPrimaryKeySelective(GameBettingAgVideo record);

    int updateByPrimaryKey(GameBettingAgVideo record);
}