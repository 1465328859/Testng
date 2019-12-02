package com.Test.model.DBmodel;

import com.Test.model.DBmodel.LotteryMethodOdds;

public interface LotteryMethodOddsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LotteryMethodOdds record);

    int insertSelective(LotteryMethodOdds record);

    LotteryMethodOdds selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LotteryMethodOdds record);

    int updateByPrimaryKeyWithBLOBs(LotteryMethodOdds record);

    int updateByPrimaryKey(LotteryMethodOdds record);
}