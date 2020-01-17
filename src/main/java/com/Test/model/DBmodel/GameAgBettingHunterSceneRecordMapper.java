package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameAgBettingHunterSceneRecord;
import com.Test.model.DBmodel.GameAgBettingHunterSceneRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameAgBettingHunterSceneRecordMapper {
    long countByExample(GameAgBettingHunterSceneRecordExample example);

    int deleteByExample(GameAgBettingHunterSceneRecordExample example);

    int deleteByPrimaryKey(String billno);

    int insert(GameAgBettingHunterSceneRecord record);

    int insertSelective(GameAgBettingHunterSceneRecord record);

    List<GameAgBettingHunterSceneRecord> selectByExample(GameAgBettingHunterSceneRecordExample example);

    GameAgBettingHunterSceneRecord selectByPrimaryKey(String billno);

    int updateByExampleSelective(@Param("record") GameAgBettingHunterSceneRecord record, @Param("example") GameAgBettingHunterSceneRecordExample example);

    int updateByExample(@Param("record") GameAgBettingHunterSceneRecord record, @Param("example") GameAgBettingHunterSceneRecordExample example);

    int updateByPrimaryKeySelective(GameAgBettingHunterSceneRecord record);

    int updateByPrimaryKey(GameAgBettingHunterSceneRecord record);
}