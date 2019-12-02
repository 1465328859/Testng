package com.Test.model.DBmodel;

import com.Test.model.DBmodel.LotteryMethods;
import com.Test.model.DBmodel.LotteryMethodsWithBLOBs;

public interface LotteryMethodsMapper {
    int deleteByPrimaryKey(Integer methodsId);

    int insert(LotteryMethodsWithBLOBs record);

    int insertSelective(LotteryMethodsWithBLOBs record);

    LotteryMethodsWithBLOBs selectByPrimaryKey(Integer methodsId);

    int updateByPrimaryKeySelective(LotteryMethodsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(LotteryMethodsWithBLOBs record);

    int updateByPrimaryKey(LotteryMethods record);
}