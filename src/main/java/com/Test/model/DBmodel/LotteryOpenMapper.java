package com.Test.model.DBmodel;

import com.Test.model.DBmodel.LotteryOpen;

public interface LotteryOpenMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LotteryOpen record);

    int insertSelective(LotteryOpen record);

    LotteryOpen selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LotteryOpen record);

    int updateByPrimaryKey(LotteryOpen record);
}