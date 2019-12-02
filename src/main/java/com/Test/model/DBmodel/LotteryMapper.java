package com.Test.model.DBmodel;

import com.Test.model.DBmodel.Lottery;

public interface LotteryMapper {
    int deleteByPrimaryKey(Integer lotteryId);

    int insert(Lottery record);

    int insertSelective(Lottery record);

    Lottery selectByPrimaryKey(Integer lotteryId);

    int updateByPrimaryKeySelective(Lottery record);

    int updateByPrimaryKey(Lottery record);
}