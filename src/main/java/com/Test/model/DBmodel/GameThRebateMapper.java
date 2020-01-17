package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameThRebate;
import com.Test.model.DBmodel.GameThRebateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameThRebateMapper {
    long countByExample(GameThRebateExample example);

    int deleteByExample(GameThRebateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameThRebate record);

    int insertSelective(GameThRebate record);

    List<GameThRebate> selectByExample(GameThRebateExample example);

    GameThRebate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameThRebate record, @Param("example") GameThRebateExample example);

    int updateByExample(@Param("record") GameThRebate record, @Param("example") GameThRebateExample example);

    int updateByPrimaryKeySelective(GameThRebate record);

    int updateByPrimaryKey(GameThRebate record);
}