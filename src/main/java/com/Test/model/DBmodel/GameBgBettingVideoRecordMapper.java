package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameBgBettingVideoRecord;
import com.Test.model.DBmodel.GameBgBettingVideoRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameBgBettingVideoRecordMapper {
    long countByExample(GameBgBettingVideoRecordExample example);

    int deleteByExample(GameBgBettingVideoRecordExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(GameBgBettingVideoRecord record);

    int insertSelective(GameBgBettingVideoRecord record);

    List<GameBgBettingVideoRecord> selectByExample(GameBgBettingVideoRecordExample example);

    GameBgBettingVideoRecord selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") GameBgBettingVideoRecord record, @Param("example") GameBgBettingVideoRecordExample example);

    int updateByExample(@Param("record") GameBgBettingVideoRecord record, @Param("example") GameBgBettingVideoRecordExample example);

    int updateByPrimaryKeySelective(GameBgBettingVideoRecord record);

    int updateByPrimaryKey(GameBgBettingVideoRecord record);
}