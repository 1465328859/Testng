package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameThBettingRecord;
import com.Test.model.DBmodel.GameThBettingRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameThBettingRecordMapper {
    long countByExample(GameThBettingRecordExample example);

    int deleteByExample(GameThBettingRecordExample example);

    int deleteByPrimaryKey(String deskUuid);

    int insert(GameThBettingRecord record);

    int insertSelective(GameThBettingRecord record);

    List<GameThBettingRecord> selectByExample(GameThBettingRecordExample example);

    GameThBettingRecord selectByPrimaryKey(String deskUuid);

    int updateByExampleSelective(@Param("record") GameThBettingRecord record, @Param("example") GameThBettingRecordExample example);

    int updateByExample(@Param("record") GameThBettingRecord record, @Param("example") GameThBettingRecordExample example);

    int updateByPrimaryKeySelective(GameThBettingRecord record);

    int updateByPrimaryKey(GameThBettingRecord record);
}