package com.Test.model.DBmodel;

import com.Test.model.DBmodel.LotteryIssueTime;

public interface LotteryIssueTimeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LotteryIssueTime record);

    int insertSelective(LotteryIssueTime record);

    LotteryIssueTime selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LotteryIssueTime record);

    int updateByPrimaryKey(LotteryIssueTime record);
}