package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameKyRebate;
import com.Test.model.DBmodel.GameKyRebateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameKyRebateMapper {
    long countByExample(GameKyRebateExample example);

    int deleteByExample(GameKyRebateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameKyRebate record);

    int insertSelective(GameKyRebate record);

    List<GameKyRebate> selectByExample(GameKyRebateExample example);

    GameKyRebate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameKyRebate record, @Param("example") GameKyRebateExample example);

    int updateByExample(@Param("record") GameKyRebate record, @Param("example") GameKyRebateExample example);

    int updateByPrimaryKeySelective(GameKyRebate record);

    int updateByPrimaryKey(GameKyRebate record);
}