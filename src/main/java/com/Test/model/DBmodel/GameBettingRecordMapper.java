package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameBettingRecord;
import com.Test.model.DBmodel.GameBettingRecordExample;
import com.Test.model.DBmodel.GameBettingRecordKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameBettingRecordMapper {
    long countByExample(GameBettingRecordExample example);

    int deleteByExample(GameBettingRecordExample example);

    int deleteByPrimaryKey(GameBettingRecordKey key);

    int insert(GameBettingRecord record);

    int insertSelective(GameBettingRecord record);

    List<GameBettingRecord> selectByExample(GameBettingRecordExample example);

    GameBettingRecord selectByPrimaryKey(GameBettingRecordKey key);

    int updateByExampleSelective(@Param("record") GameBettingRecord record, @Param("example") GameBettingRecordExample example);

    int updateByExample(@Param("record") GameBettingRecord record, @Param("example") GameBettingRecordExample example);

    int updateByPrimaryKeySelective(GameBettingRecord record);

    int updateByPrimaryKey(GameBettingRecord record);
}