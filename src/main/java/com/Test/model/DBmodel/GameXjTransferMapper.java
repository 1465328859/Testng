package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameXjTransfer;
import com.Test.model.DBmodel.GameXjTransferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameXjTransferMapper {
    long countByExample(GameXjTransferExample example);

    int deleteByExample(GameXjTransferExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameXjTransfer record);

    int insertSelective(GameXjTransfer record);

    List<GameXjTransfer> selectByExample(GameXjTransferExample example);

    GameXjTransfer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameXjTransfer record, @Param("example") GameXjTransferExample example);

    int updateByExample(@Param("record") GameXjTransfer record, @Param("example") GameXjTransferExample example);

    int updateByPrimaryKeySelective(GameXjTransfer record);

    int updateByPrimaryKey(GameXjTransfer record);
}