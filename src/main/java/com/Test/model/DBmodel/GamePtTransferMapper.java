package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GamePtTransfer;
import com.Test.model.DBmodel.GamePtTransferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GamePtTransferMapper {
    long countByExample(GamePtTransferExample example);

    int deleteByExample(GamePtTransferExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GamePtTransfer record);

    int insertSelective(GamePtTransfer record);

    List<GamePtTransfer> selectByExample(GamePtTransferExample example);

    GamePtTransfer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GamePtTransfer record, @Param("example") GamePtTransferExample example);

    int updateByExample(@Param("record") GamePtTransfer record, @Param("example") GamePtTransferExample example);

    int updateByPrimaryKeySelective(GamePtTransfer record);

    int updateByPrimaryKey(GamePtTransfer record);
}