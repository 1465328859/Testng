package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameBbinBettingVideoRecord;
import com.Test.model.DBmodel.GameBbinBettingVideoRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameBbinBettingVideoRecordMapper {
    long countByExample(GameBbinBettingVideoRecordExample example);

    int deleteByExample(GameBbinBettingVideoRecordExample example);

    int deleteByPrimaryKey(String wagersId);

    int insert(GameBbinBettingVideoRecord record);

    int insertSelective(GameBbinBettingVideoRecord record);

    List<GameBbinBettingVideoRecord> selectByExample(GameBbinBettingVideoRecordExample example);

    GameBbinBettingVideoRecord selectByPrimaryKey(String wagersId);

    int updateByExampleSelective(@Param("record") GameBbinBettingVideoRecord record, @Param("example") GameBbinBettingVideoRecordExample example);

    int updateByExample(@Param("record") GameBbinBettingVideoRecord record, @Param("example") GameBbinBettingVideoRecordExample example);

    int updateByPrimaryKeySelective(GameBbinBettingVideoRecord record);

    int updateByPrimaryKey(GameBbinBettingVideoRecord record);
}