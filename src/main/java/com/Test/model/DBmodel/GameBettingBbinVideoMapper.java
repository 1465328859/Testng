package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameBettingBbinVideo;
import com.Test.model.DBmodel.GameBettingBbinVideoExample;
import com.Test.model.DBmodel.GameBettingBbinVideoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameBettingBbinVideoMapper {
    long countByExample(GameBettingBbinVideoExample example);

    int deleteByExample(GameBettingBbinVideoExample example);

    int deleteByPrimaryKey(GameBettingBbinVideoKey key);

    int insert(GameBettingBbinVideo record);

    int insertSelective(GameBettingBbinVideo record);

    List<GameBettingBbinVideo> selectByExample(GameBettingBbinVideoExample example);

    GameBettingBbinVideo selectByPrimaryKey(GameBettingBbinVideoKey key);

    int updateByExampleSelective(@Param("record") GameBettingBbinVideo record, @Param("example") GameBettingBbinVideoExample example);

    int updateByExample(@Param("record") GameBettingBbinVideo record, @Param("example") GameBettingBbinVideoExample example);

    int updateByPrimaryKeySelective(GameBettingBbinVideo record);

    int updateByPrimaryKey(GameBettingBbinVideo record);
}