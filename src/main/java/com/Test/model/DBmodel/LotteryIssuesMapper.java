package com.Test.model.DBmodel;

import com.Test.model.DBmodel.LotteryIssues;
import com.Test.model.DBmodel.LotteryIssuesExample;
import com.Test.model.DBmodel.LotteryIssuesKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LotteryIssuesMapper {
    long countByExample(LotteryIssuesExample example);

    int deleteByExample(LotteryIssuesExample example);

    int deleteByPrimaryKey(LotteryIssuesKey key);

    int insert(LotteryIssues record);

    int insertSelective(LotteryIssues record);

    List<LotteryIssues> selectByExample(LotteryIssuesExample example);

    LotteryIssues selectByPrimaryKey(LotteryIssuesKey key);

    int updateByExampleSelective(@Param("record") LotteryIssues record, @Param("example") LotteryIssuesExample example);

    int updateByExample(@Param("record") LotteryIssues record, @Param("example") LotteryIssuesExample example);

    int updateByPrimaryKeySelective(LotteryIssues record);

    int updateByPrimaryKey(LotteryIssues record);
}