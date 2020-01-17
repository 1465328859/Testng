package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameMgRebate;
import com.Test.model.DBmodel.GameMgRebateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameMgRebateMapper {
    long countByExample(GameMgRebateExample example);

    int deleteByExample(GameMgRebateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameMgRebate record);

    int insertSelective(GameMgRebate record);

    List<GameMgRebate> selectByExample(GameMgRebateExample example);

    GameMgRebate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameMgRebate record, @Param("example") GameMgRebateExample example);

    int updateByExample(@Param("record") GameMgRebate record, @Param("example") GameMgRebateExample example);

    int updateByPrimaryKeySelective(GameMgRebate record);

    int updateByPrimaryKey(GameMgRebate record);
}