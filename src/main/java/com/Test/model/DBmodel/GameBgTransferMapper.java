package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameBgTransfer;
import com.Test.model.DBmodel.GameBgTransferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameBgTransferMapper {
    long countByExample(GameBgTransferExample example);

    int deleteByExample(GameBgTransferExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameBgTransfer record);

    int insertSelective(GameBgTransfer record);

    List<GameBgTransfer> selectByExample(GameBgTransferExample example);

    GameBgTransfer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameBgTransfer record, @Param("example") GameBgTransferExample example);

    int updateByExample(@Param("record") GameBgTransfer record, @Param("example") GameBgTransferExample example);

    int updateByPrimaryKeySelective(GameBgTransfer record);

    int updateByPrimaryKey(GameBgTransfer record);
}