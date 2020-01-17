package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameGjRebate;
import com.Test.model.DBmodel.GameGjRebateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameGjRebateMapper {
    long countByExample(GameGjRebateExample example);

    int deleteByExample(GameGjRebateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameGjRebate record);

    int insertSelective(GameGjRebate record);

    List<GameGjRebate> selectByExample(GameGjRebateExample example);

    GameGjRebate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameGjRebate record, @Param("example") GameGjRebateExample example);

    int updateByExample(@Param("record") GameGjRebate record, @Param("example") GameGjRebateExample example);

    int updateByPrimaryKeySelective(GameGjRebate record);

    int updateByPrimaryKey(GameGjRebate record);
}