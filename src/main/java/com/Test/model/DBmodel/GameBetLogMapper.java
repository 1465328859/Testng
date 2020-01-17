package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameBetLog;
import com.Test.model.DBmodel.GameBetLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameBetLogMapper {
    long countByExample(GameBetLogExample example);

    int deleteByExample(GameBetLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameBetLog record);

    int insertSelective(GameBetLog record);

    List<GameBetLog> selectByExample(GameBetLogExample example);

    GameBetLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameBetLog record, @Param("example") GameBetLogExample example);

    int updateByExample(@Param("record") GameBetLog record, @Param("example") GameBetLogExample example);

    int updateByPrimaryKeySelective(GameBetLog record);

    int updateByPrimaryKey(GameBetLog record);
}