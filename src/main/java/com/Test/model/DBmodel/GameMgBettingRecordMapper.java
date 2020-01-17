package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameMgBettingRecord;
import com.Test.model.DBmodel.GameMgBettingRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameMgBettingRecordMapper {
    long countByExample(GameMgBettingRecordExample example);

    int deleteByExample(GameMgBettingRecordExample example);

    int deleteByPrimaryKey(Long tId);

    int insert(GameMgBettingRecord record);

    int insertSelective(GameMgBettingRecord record);

    List<GameMgBettingRecord> selectByExample(GameMgBettingRecordExample example);

    GameMgBettingRecord selectByPrimaryKey(Long tId);

    int updateByExampleSelective(@Param("record") GameMgBettingRecord record, @Param("example") GameMgBettingRecordExample example);

    int updateByExample(@Param("record") GameMgBettingRecord record, @Param("example") GameMgBettingRecordExample example);

    int updateByPrimaryKeySelective(GameMgBettingRecord record);

    int updateByPrimaryKey(GameMgBettingRecord record);
}