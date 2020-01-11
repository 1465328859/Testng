package com.Test.model.DBmodel;

import com.Test.model.DBmodel.LotteryLongDragon;
import com.Test.model.DBmodel.LotteryLongDragonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LotteryLongDragonMapper {
    long countByExample(LotteryLongDragonExample example);

    int deleteByExample(LotteryLongDragonExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LotteryLongDragon record);

    int insertSelective(LotteryLongDragon record);

    List<LotteryLongDragon> selectByExample(LotteryLongDragonExample example);

    LotteryLongDragon selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LotteryLongDragon record, @Param("example") LotteryLongDragonExample example);

    int updateByExample(@Param("record") LotteryLongDragon record, @Param("example") LotteryLongDragonExample example);

    int updateByPrimaryKeySelective(LotteryLongDragon record);

    int updateByPrimaryKey(LotteryLongDragon record);
}