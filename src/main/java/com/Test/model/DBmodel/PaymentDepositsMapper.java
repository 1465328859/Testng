package com.Test.model.DBmodel;

import com.Test.model.DBmodel.PaymentDeposits;

public interface PaymentDepositsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PaymentDeposits record);

    int insertSelective(PaymentDeposits record);

    PaymentDeposits selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PaymentDeposits record);

    int updateByPrimaryKey(PaymentDeposits record);
}