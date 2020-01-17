package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameJdbBettingHunterRecord;
import com.Test.model.DBmodel.GameJdbBettingHunterRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameJdbBettingHunterRecordMapper {
    long countByExample(GameJdbBettingHunterRecordExample example);

    int deleteByExample(GameJdbBettingHunterRecordExample example);

    int deleteByPrimaryKey(Long seqNo);

    int insert(GameJdbBettingHunterRecord record);

    int insertSelective(GameJdbBettingHunterRecord record);

    List<GameJdbBettingHunterRecord> selectByExample(GameJdbBettingHunterRecordExample example);

    GameJdbBettingHunterRecord selectByPrimaryKey(Long seqNo);

    int updateByExampleSelective(@Param("record") GameJdbBettingHunterRecord record, @Param("example") GameJdbBettingHunterRecordExample example);

    int updateByExample(@Param("record") GameJdbBettingHunterRecord record, @Param("example") GameJdbBettingHunterRecordExample example);

    int updateByPrimaryKeySelective(GameJdbBettingHunterRecord record);

    int updateByPrimaryKey(GameJdbBettingHunterRecord record);
}