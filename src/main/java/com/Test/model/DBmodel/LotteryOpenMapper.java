package com.Test.model.DBmodel;

import com.Test.model.DBmodel.LotteryOpen;
import com.Test.model.DBmodel.LotteryOpenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LotteryOpenMapper {
    long countByExample(LotteryOpenExample example);

    int deleteByExample(LotteryOpenExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LotteryOpen record);

    int insertSelective(LotteryOpen record);

    List<LotteryOpen> selectByExample(LotteryOpenExample example);

    LotteryOpen selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LotteryOpen record, @Param("example") LotteryOpenExample example);

    int updateByExample(@Param("record") LotteryOpen record, @Param("example") LotteryOpenExample example);

    int updateByPrimaryKeySelective(LotteryOpen record);

    int updateByPrimaryKey(LotteryOpen record);
}