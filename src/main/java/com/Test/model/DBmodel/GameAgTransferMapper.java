package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameAgTransfer;
import com.Test.model.DBmodel.GameAgTransferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameAgTransferMapper {
    long countByExample(GameAgTransferExample example);

    int deleteByExample(GameAgTransferExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameAgTransfer record);

    int insertSelective(GameAgTransfer record);

    List<GameAgTransfer> selectByExample(GameAgTransferExample example);

    GameAgTransfer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameAgTransfer record, @Param("example") GameAgTransferExample example);

    int updateByExample(@Param("record") GameAgTransfer record, @Param("example") GameAgTransferExample example);

    int updateByPrimaryKeySelective(GameAgTransfer record);

    int updateByPrimaryKey(GameAgTransfer record);
}