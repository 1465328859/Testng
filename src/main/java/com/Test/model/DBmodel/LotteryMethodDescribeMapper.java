package com.Test.model.DBmodel;

import com.Test.model.DBmodel.LotteryMethodDescribe;
import com.Test.model.DBmodel.LotteryMethodDescribeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LotteryMethodDescribeMapper {
    long countByExample(LotteryMethodDescribeExample example);

    int deleteByExample(LotteryMethodDescribeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LotteryMethodDescribe record);

    int insertSelective(LotteryMethodDescribe record);

    List<LotteryMethodDescribe> selectByExample(LotteryMethodDescribeExample example);

    LotteryMethodDescribe selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LotteryMethodDescribe record, @Param("example") LotteryMethodDescribeExample example);

    int updateByExample(@Param("record") LotteryMethodDescribe record, @Param("example") LotteryMethodDescribeExample example);

    int updateByPrimaryKeySelective(LotteryMethodDescribe record);

    int updateByPrimaryKey(LotteryMethodDescribe record);
}