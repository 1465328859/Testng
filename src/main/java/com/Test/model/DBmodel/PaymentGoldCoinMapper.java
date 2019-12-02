package com.Test.model.DBmodel;

import com.Test.model.DBmodel.PaymentGoldCoin;

public interface PaymentGoldCoinMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PaymentGoldCoin record);

    int insertSelective(PaymentGoldCoin record);

    PaymentGoldCoin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PaymentGoldCoin record);

    int updateByPrimaryKey(PaymentGoldCoin record);
}