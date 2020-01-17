package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameMgTransfer;
import com.Test.model.DBmodel.GameMgTransferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameMgTransferMapper {
    long countByExample(GameMgTransferExample example);

    int deleteByExample(GameMgTransferExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameMgTransfer record);

    int insertSelective(GameMgTransfer record);

    List<GameMgTransfer> selectByExample(GameMgTransferExample example);

    GameMgTransfer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameMgTransfer record, @Param("example") GameMgTransferExample example);

    int updateByExample(@Param("record") GameMgTransfer record, @Param("example") GameMgTransferExample example);

    int updateByPrimaryKeySelective(GameMgTransfer record);

    int updateByPrimaryKey(GameMgTransfer record);
}