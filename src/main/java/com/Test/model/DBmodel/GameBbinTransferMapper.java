package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameBbinTransfer;
import com.Test.model.DBmodel.GameBbinTransferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameBbinTransferMapper {
    long countByExample(GameBbinTransferExample example);

    int deleteByExample(GameBbinTransferExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameBbinTransfer record);

    int insertSelective(GameBbinTransfer record);

    List<GameBbinTransfer> selectByExample(GameBbinTransferExample example);

    GameBbinTransfer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameBbinTransfer record, @Param("example") GameBbinTransferExample example);

    int updateByExample(@Param("record") GameBbinTransfer record, @Param("example") GameBbinTransferExample example);

    int updateByPrimaryKeySelective(GameBbinTransfer record);

    int updateByPrimaryKey(GameBbinTransfer record);
}