package com.Test.model.DBmodel;

import com.Test.model.DBmodel.LotteryIssues;
import com.Test.model.DBmodel.LotteryIssuesKey;

public interface LotteryIssuesMapper {
    int deleteByPrimaryKey(LotteryIssuesKey key);

    int insert(LotteryIssues record);

    int insertSelective(LotteryIssues record);

    LotteryIssues selectByPrimaryKey(LotteryIssuesKey key);

    int updateByPrimaryKeySelective(LotteryIssues record);

    int updateByPrimaryKey(LotteryIssues record);
}