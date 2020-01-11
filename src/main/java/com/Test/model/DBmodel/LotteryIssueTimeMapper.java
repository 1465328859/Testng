package com.Test.model.DBmodel;

import com.Test.model.DBmodel.LotteryIssueTime;
import com.Test.model.DBmodel.LotteryIssueTimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LotteryIssueTimeMapper {
    long countByExample(LotteryIssueTimeExample example);

    int deleteByExample(LotteryIssueTimeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LotteryIssueTime record);

    int insertSelective(LotteryIssueTime record);

    List<LotteryIssueTime> selectByExample(LotteryIssueTimeExample example);

    LotteryIssueTime selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LotteryIssueTime record, @Param("example") LotteryIssueTimeExample example);

    int updateByExample(@Param("record") LotteryIssueTime record, @Param("example") LotteryIssueTimeExample example);

    int updateByPrimaryKeySelective(LotteryIssueTime record);

    int updateByPrimaryKey(LotteryIssueTime record);
}