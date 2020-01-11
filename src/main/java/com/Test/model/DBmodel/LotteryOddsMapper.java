package com.Test.model.DBmodel;

import com.Test.model.DBmodel.LotteryOdds;
import com.Test.model.DBmodel.LotteryOddsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LotteryOddsMapper {
    long countByExample(LotteryOddsExample example);

    int deleteByExample(LotteryOddsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LotteryOdds record);

    int insertSelective(LotteryOdds record);

    List<LotteryOdds> selectByExample(LotteryOddsExample example);

    LotteryOdds selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LotteryOdds record, @Param("example") LotteryOddsExample example);

    int updateByExample(@Param("record") LotteryOdds record, @Param("example") LotteryOddsExample example);

    int updateByPrimaryKeySelective(LotteryOdds record);

    int updateByPrimaryKey(LotteryOdds record);
}