package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GamePtRebate;
import com.Test.model.DBmodel.GamePtRebateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GamePtRebateMapper {
    long countByExample(GamePtRebateExample example);

    int deleteByExample(GamePtRebateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GamePtRebate record);

    int insertSelective(GamePtRebate record);

    List<GamePtRebate> selectByExample(GamePtRebateExample example);

    GamePtRebate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GamePtRebate record, @Param("example") GamePtRebateExample example);

    int updateByExample(@Param("record") GamePtRebate record, @Param("example") GamePtRebateExample example);

    int updateByPrimaryKeySelective(GamePtRebate record);

    int updateByPrimaryKey(GamePtRebate record);
}