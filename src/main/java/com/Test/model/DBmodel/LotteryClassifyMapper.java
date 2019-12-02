package com.Test.model.DBmodel;

import com.Test.model.DBmodel.LotteryClassify;

public interface LotteryClassifyMapper {
    int deleteByPrimaryKey(Integer lotteryClassifyId);

    int insert(LotteryClassify record);

    int insertSelective(LotteryClassify record);

    LotteryClassify selectByPrimaryKey(Integer lotteryClassifyId);

    int updateByPrimaryKeySelective(LotteryClassify record);

    int updateByPrimaryKeyWithBLOBs(LotteryClassify record);

    int updateByPrimaryKey(LotteryClassify record);
}