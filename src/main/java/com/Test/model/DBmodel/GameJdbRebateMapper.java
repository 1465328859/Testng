package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameJdbRebate;
import com.Test.model.DBmodel.GameJdbRebateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameJdbRebateMapper {
    long countByExample(GameJdbRebateExample example);

    int deleteByExample(GameJdbRebateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameJdbRebate record);

    int insertSelective(GameJdbRebate record);

    List<GameJdbRebate> selectByExample(GameJdbRebateExample example);

    GameJdbRebate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameJdbRebate record, @Param("example") GameJdbRebateExample example);

    int updateByExample(@Param("record") GameJdbRebate record, @Param("example") GameJdbRebateExample example);

    int updateByPrimaryKeySelective(GameJdbRebate record);

    int updateByPrimaryKey(GameJdbRebate record);
}