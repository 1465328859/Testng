package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameKyTransfer;
import com.Test.model.DBmodel.GameKyTransferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameKyTransferMapper {
    long countByExample(GameKyTransferExample example);

    int deleteByExample(GameKyTransferExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameKyTransfer record);

    int insertSelective(GameKyTransfer record);

    List<GameKyTransfer> selectByExample(GameKyTransferExample example);

    GameKyTransfer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameKyTransfer record, @Param("example") GameKyTransferExample example);

    int updateByExample(@Param("record") GameKyTransfer record, @Param("example") GameKyTransferExample example);

    int updateByPrimaryKeySelective(GameKyTransfer record);

    int updateByPrimaryKey(GameKyTransfer record);
}