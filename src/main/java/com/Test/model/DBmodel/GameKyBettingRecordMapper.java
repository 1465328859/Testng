package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameKyBettingRecord;
import com.Test.model.DBmodel.GameKyBettingRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameKyBettingRecordMapper {
    long countByExample(GameKyBettingRecordExample example);

    int deleteByExample(GameKyBettingRecordExample example);

    int deleteByPrimaryKey(String gameId);

    int insert(GameKyBettingRecord record);

    int insertSelective(GameKyBettingRecord record);

    List<GameKyBettingRecord> selectByExample(GameKyBettingRecordExample example);

    GameKyBettingRecord selectByPrimaryKey(String gameId);

    int updateByExampleSelective(@Param("record") GameKyBettingRecord record, @Param("example") GameKyBettingRecordExample example);

    int updateByExample(@Param("record") GameKyBettingRecord record, @Param("example") GameKyBettingRecordExample example);

    int updateByPrimaryKeySelective(GameKyBettingRecord record);

    int updateByPrimaryKey(GameKyBettingRecord record);
}