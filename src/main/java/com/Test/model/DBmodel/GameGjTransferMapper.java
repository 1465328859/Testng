package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameGjTransfer;
import com.Test.model.DBmodel.GameGjTransferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameGjTransferMapper {
    long countByExample(GameGjTransferExample example);

    int deleteByExample(GameGjTransferExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameGjTransfer record);

    int insertSelective(GameGjTransfer record);

    List<GameGjTransfer> selectByExample(GameGjTransferExample example);

    GameGjTransfer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameGjTransfer record, @Param("example") GameGjTransferExample example);

    int updateByExample(@Param("record") GameGjTransfer record, @Param("example") GameGjTransferExample example);

    int updateByPrimaryKeySelective(GameGjTransfer record);

    int updateByPrimaryKey(GameGjTransfer record);
}