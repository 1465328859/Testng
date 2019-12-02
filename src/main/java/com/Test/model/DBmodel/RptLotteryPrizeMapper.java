package com.Test.model.DBmodel;

import com.Test.model.DBmodel.RptLotteryPrize;

public interface RptLotteryPrizeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RptLotteryPrize record);

    int insertSelective(RptLotteryPrize record);

    RptLotteryPrize selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RptLotteryPrize record);

    int updateByPrimaryKey(RptLotteryPrize record);
}