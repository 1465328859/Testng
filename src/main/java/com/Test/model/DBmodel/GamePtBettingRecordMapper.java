package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GamePtBettingRecord;
import com.Test.model.DBmodel.GamePtBettingRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GamePtBettingRecordMapper {
    long countByExample(GamePtBettingRecordExample example);

    int deleteByExample(GamePtBettingRecordExample example);

    int deleteByPrimaryKey(Long gameCode);

    int insert(GamePtBettingRecord record);

    int insertSelective(GamePtBettingRecord record);

    List<GamePtBettingRecord> selectByExample(GamePtBettingRecordExample example);

    GamePtBettingRecord selectByPrimaryKey(Long gameCode);

    int updateByExampleSelective(@Param("record") GamePtBettingRecord record, @Param("example") GamePtBettingRecordExample example);

    int updateByExample(@Param("record") GamePtBettingRecord record, @Param("example") GamePtBettingRecordExample example);

    int updateByPrimaryKeySelective(GamePtBettingRecord record);

    int updateByPrimaryKey(GamePtBettingRecord record);
}