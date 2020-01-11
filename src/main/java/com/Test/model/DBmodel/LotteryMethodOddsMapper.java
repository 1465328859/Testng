package com.Test.model.DBmodel;

import com.Test.model.DBmodel.LotteryMethodOdds;
import com.Test.model.DBmodel.LotteryMethodOddsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LotteryMethodOddsMapper {
    long countByExample(LotteryMethodOddsExample example);

    int deleteByExample(LotteryMethodOddsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LotteryMethodOdds record);

    int insertSelective(LotteryMethodOdds record);

    List<LotteryMethodOdds> selectByExampleWithBLOBs(LotteryMethodOddsExample example);

    List<LotteryMethodOdds> selectByExample(LotteryMethodOddsExample example);

    LotteryMethodOdds selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LotteryMethodOdds record, @Param("example") LotteryMethodOddsExample example);

    int updateByExampleWithBLOBs(@Param("record") LotteryMethodOdds record, @Param("example") LotteryMethodOddsExample example);

    int updateByExample(@Param("record") LotteryMethodOdds record, @Param("example") LotteryMethodOddsExample example);

    int updateByPrimaryKeySelective(LotteryMethodOdds record);

    int updateByPrimaryKeyWithBLOBs(LotteryMethodOdds record);

    int updateByPrimaryKey(LotteryMethodOdds record);
}