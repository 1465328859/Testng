package com.Test.model.DBmodel;

import com.Test.model.DBmodel.LotteryMethodDescribe;

public interface LotteryMethodDescribeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LotteryMethodDescribe record);

    int insertSelective(LotteryMethodDescribe record);

    LotteryMethodDescribe selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LotteryMethodDescribe record);

    int updateByPrimaryKey(LotteryMethodDescribe record);
}