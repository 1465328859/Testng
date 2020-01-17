package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameThTransfer;
import com.Test.model.DBmodel.GameThTransferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameThTransferMapper {
    long countByExample(GameThTransferExample example);

    int deleteByExample(GameThTransferExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameThTransfer record);

    int insertSelective(GameThTransfer record);

    List<GameThTransfer> selectByExample(GameThTransferExample example);

    GameThTransfer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameThTransfer record, @Param("example") GameThTransferExample example);

    int updateByExample(@Param("record") GameThTransfer record, @Param("example") GameThTransferExample example);

    int updateByPrimaryKeySelective(GameThTransfer record);

    int updateByPrimaryKey(GameThTransfer record);
}