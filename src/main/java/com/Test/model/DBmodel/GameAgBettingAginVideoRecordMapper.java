package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameAgBettingAginVideoRecord;
import com.Test.model.DBmodel.GameAgBettingAginVideoRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameAgBettingAginVideoRecordMapper {
    long countByExample(GameAgBettingAginVideoRecordExample example);

    int deleteByExample(GameAgBettingAginVideoRecordExample example);

    int deleteByPrimaryKey(String billno);

    int insert(GameAgBettingAginVideoRecord record);

    int insertSelective(GameAgBettingAginVideoRecord record);

    List<GameAgBettingAginVideoRecord> selectByExample(GameAgBettingAginVideoRecordExample example);

    GameAgBettingAginVideoRecord selectByPrimaryKey(String billno);

    int updateByExampleSelective(@Param("record") GameAgBettingAginVideoRecord record, @Param("example") GameAgBettingAginVideoRecordExample example);

    int updateByExample(@Param("record") GameAgBettingAginVideoRecord record, @Param("example") GameAgBettingAginVideoRecordExample example);

    int updateByPrimaryKeySelective(GameAgBettingAginVideoRecord record);

    int updateByPrimaryKey(GameAgBettingAginVideoRecord record);
}