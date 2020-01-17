package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameXjRebate;
import com.Test.model.DBmodel.GameXjRebateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameXjRebateMapper {
    long countByExample(GameXjRebateExample example);

    int deleteByExample(GameXjRebateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameXjRebate record);

    int insertSelective(GameXjRebate record);

    List<GameXjRebate> selectByExample(GameXjRebateExample example);

    GameXjRebate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameXjRebate record, @Param("example") GameXjRebateExample example);

    int updateByExample(@Param("record") GameXjRebate record, @Param("example") GameXjRebateExample example);

    int updateByPrimaryKeySelective(GameXjRebate record);

    int updateByPrimaryKey(GameXjRebate record);
}