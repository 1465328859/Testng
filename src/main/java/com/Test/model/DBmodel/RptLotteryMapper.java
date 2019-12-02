package com.Test.model.DBmodel;

import com.Test.model.DBmodel.RptLottery;

public interface RptLotteryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RptLottery record);

    int insertSelective(RptLottery record);

    RptLottery selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RptLottery record);

    int updateByPrimaryKeyWithBLOBs(RptLottery record);

    int updateByPrimaryKey(RptLottery record);
}