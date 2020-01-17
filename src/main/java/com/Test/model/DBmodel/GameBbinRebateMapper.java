package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameBbinRebate;
import com.Test.model.DBmodel.GameBbinRebateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameBbinRebateMapper {
    long countByExample(GameBbinRebateExample example);

    int deleteByExample(GameBbinRebateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameBbinRebate record);

    int insertSelective(GameBbinRebate record);

    List<GameBbinRebate> selectByExample(GameBbinRebateExample example);

    GameBbinRebate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameBbinRebate record, @Param("example") GameBbinRebateExample example);

    int updateByExample(@Param("record") GameBbinRebate record, @Param("example") GameBbinRebateExample example);

    int updateByPrimaryKeySelective(GameBbinRebate record);

    int updateByPrimaryKey(GameBbinRebate record);
}