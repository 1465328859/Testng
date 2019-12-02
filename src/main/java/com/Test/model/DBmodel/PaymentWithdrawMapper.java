package com.Test.model.DBmodel;

import com.Test.model.DBmodel.PaymentWithdraw;

public interface PaymentWithdrawMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PaymentWithdraw record);

    int insertSelective(PaymentWithdraw record);

    PaymentWithdraw selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PaymentWithdraw record);

    int updateByPrimaryKey(PaymentWithdraw record);
}