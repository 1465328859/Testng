package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameAgRebate;
import com.Test.model.DBmodel.GameAgRebateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameAgRebateMapper {
    long countByExample(GameAgRebateExample example);

    int deleteByExample(GameAgRebateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameAgRebate record);

    int insertSelective(GameAgRebate record);

    List<GameAgRebate> selectByExample(GameAgRebateExample example);

    GameAgRebate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameAgRebate record, @Param("example") GameAgRebateExample example);

    int updateByExample(@Param("record") GameAgRebate record, @Param("example") GameAgRebateExample example);

    int updateByPrimaryKeySelective(GameAgRebate record);

    int updateByPrimaryKey(GameAgRebate record);
}