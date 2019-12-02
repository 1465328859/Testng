package com.Test.model.DBmodel;

import com.Test.model.DBmodel.LotteryMethodGroup;

public interface LotteryMethodGroupMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LotteryMethodGroup record);

    int insertSelective(LotteryMethodGroup record);

    LotteryMethodGroup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LotteryMethodGroup record);

    int updateByPrimaryKey(LotteryMethodGroup record);
}