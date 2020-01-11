package com.Test.model.DBmodel;

import com.Test.model.DBmodel.RptLotteryPrize;
import com.Test.model.DBmodel.RptLotteryPrizeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RptLotteryPrizeMapper {
    long countByExample(RptLotteryPrizeExample example);

    int deleteByExample(RptLotteryPrizeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RptLotteryPrize record);

    int insertSelective(RptLotteryPrize record);

    List<RptLotteryPrize> selectByExample(RptLotteryPrizeExample example);

    RptLotteryPrize selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RptLotteryPrize record, @Param("example") RptLotteryPrizeExample example);

    int updateByExample(@Param("record") RptLotteryPrize record, @Param("example") RptLotteryPrizeExample example);

    int updateByPrimaryKeySelective(RptLotteryPrize record);

    int updateByPrimaryKey(RptLotteryPrize record);
}