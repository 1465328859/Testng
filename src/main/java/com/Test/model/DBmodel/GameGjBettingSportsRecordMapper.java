package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameGjBettingSportsRecord;
import com.Test.model.DBmodel.GameGjBettingSportsRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameGjBettingSportsRecordMapper {
    long countByExample(GameGjBettingSportsRecordExample example);

    int deleteByExample(GameGjBettingSportsRecordExample example);

    int deleteByPrimaryKey(String gameSn);

    int insert(GameGjBettingSportsRecord record);

    int insertSelective(GameGjBettingSportsRecord record);

    List<GameGjBettingSportsRecord> selectByExampleWithBLOBs(GameGjBettingSportsRecordExample example);

    List<GameGjBettingSportsRecord> selectByExample(GameGjBettingSportsRecordExample example);

    GameGjBettingSportsRecord selectByPrimaryKey(String gameSn);

    int updateByExampleSelective(@Param("record") GameGjBettingSportsRecord record, @Param("example") GameGjBettingSportsRecordExample example);

    int updateByExampleWithBLOBs(@Param("record") GameGjBettingSportsRecord record, @Param("example") GameGjBettingSportsRecordExample example);

    int updateByExample(@Param("record") GameGjBettingSportsRecord record, @Param("example") GameGjBettingSportsRecordExample example);

    int updateByPrimaryKeySelective(GameGjBettingSportsRecord record);

    int updateByPrimaryKeyWithBLOBs(GameGjBettingSportsRecord record);

    int updateByPrimaryKey(GameGjBettingSportsRecord record);
}