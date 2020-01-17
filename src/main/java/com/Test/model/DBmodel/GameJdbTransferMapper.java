package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameJdbTransfer;
import com.Test.model.DBmodel.GameJdbTransferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameJdbTransferMapper {
    long countByExample(GameJdbTransferExample example);

    int deleteByExample(GameJdbTransferExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameJdbTransfer record);

    int insertSelective(GameJdbTransfer record);

    List<GameJdbTransfer> selectByExample(GameJdbTransferExample example);

    GameJdbTransfer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameJdbTransfer record, @Param("example") GameJdbTransferExample example);

    int updateByExample(@Param("record") GameJdbTransfer record, @Param("example") GameJdbTransferExample example);

    int updateByPrimaryKeySelective(GameJdbTransfer record);

    int updateByPrimaryKey(GameJdbTransfer record);
}