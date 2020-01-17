package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameXjBettingRecord;
import com.Test.model.DBmodel.GameXjBettingRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameXjBettingRecordMapper {
    long countByExample(GameXjBettingRecordExample example);

    int deleteByExample(GameXjBettingRecordExample example);

    int deleteByPrimaryKey(String betId);

    int insert(GameXjBettingRecord record);

    int insertSelective(GameXjBettingRecord record);

    List<GameXjBettingRecord> selectByExample(GameXjBettingRecordExample example);

    GameXjBettingRecord selectByPrimaryKey(String betId);

    int updateByExampleSelective(@Param("record") GameXjBettingRecord record, @Param("example") GameXjBettingRecordExample example);

    int updateByExample(@Param("record") GameXjBettingRecord record, @Param("example") GameXjBettingRecordExample example);

    int updateByPrimaryKeySelective(GameXjBettingRecord record);

    int updateByPrimaryKey(GameXjBettingRecord record);
}