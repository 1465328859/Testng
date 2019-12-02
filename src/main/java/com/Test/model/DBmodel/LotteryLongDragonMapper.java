package com.Test.model.DBmodel;

import com.Test.model.DBmodel.LotteryLongDragon;

public interface LotteryLongDragonMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LotteryLongDragon record);

    int insertSelective(LotteryLongDragon record);

    LotteryLongDragon selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LotteryLongDragon record);

    int updateByPrimaryKey(LotteryLongDragon record);
}