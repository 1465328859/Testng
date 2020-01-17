package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameBgRebate;
import com.Test.model.DBmodel.GameBgRebateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameBgRebateMapper {
    long countByExample(GameBgRebateExample example);

    int deleteByExample(GameBgRebateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameBgRebate record);

    int insertSelective(GameBgRebate record);

    List<GameBgRebate> selectByExample(GameBgRebateExample example);

    GameBgRebate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameBgRebate record, @Param("example") GameBgRebateExample example);

    int updateByExample(@Param("record") GameBgRebate record, @Param("example") GameBgRebateExample example);

    int updateByPrimaryKeySelective(GameBgRebate record);

    int updateByPrimaryKey(GameBgRebate record);
}