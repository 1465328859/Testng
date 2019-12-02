package com.Test.model.DBmodel;

import com.Test.model.DBmodel.LotteryClassifyIntr;

public interface LotteryClassifyIntrMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LotteryClassifyIntr record);

    int insertSelective(LotteryClassifyIntr record);

    LotteryClassifyIntr selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LotteryClassifyIntr record);

    int updateByPrimaryKeyWithBLOBs(LotteryClassifyIntr record);

    int updateByPrimaryKey(LotteryClassifyIntr record);
}