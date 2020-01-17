package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameBettingBgVideo;
import com.Test.model.DBmodel.GameBettingBgVideoExample;
import com.Test.model.DBmodel.GameBettingBgVideoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameBettingBgVideoMapper {
    long countByExample(GameBettingBgVideoExample example);

    int deleteByExample(GameBettingBgVideoExample example);

    int deleteByPrimaryKey(GameBettingBgVideoKey key);

    int insert(GameBettingBgVideo record);

    int insertSelective(GameBettingBgVideo record);

    List<GameBettingBgVideo> selectByExample(GameBettingBgVideoExample example);

    GameBettingBgVideo selectByPrimaryKey(GameBettingBgVideoKey key);

    int updateByExampleSelective(@Param("record") GameBettingBgVideo record, @Param("example") GameBettingBgVideoExample example);

    int updateByExample(@Param("record") GameBettingBgVideo record, @Param("example") GameBettingBgVideoExample example);

    int updateByPrimaryKeySelective(GameBettingBgVideo record);

    int updateByPrimaryKey(GameBettingBgVideo record);
}