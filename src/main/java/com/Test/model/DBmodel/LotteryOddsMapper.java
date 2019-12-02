package com.Test.model.DBmodel;

import com.Test.model.DBmodel.LotteryOdds;

public interface LotteryOddsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LotteryOdds record);

    int insertSelective(LotteryOdds record);

    LotteryOdds selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LotteryOdds record);

    int updateByPrimaryKey(LotteryOdds record);
}