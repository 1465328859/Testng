package com.Test.model.DBmodel;

import com.Test.model.DBmodel.PaymentTransfer;

public interface PaymentTransferMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PaymentTransfer record);

    int insertSelective(PaymentTransfer record);

    PaymentTransfer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PaymentTransfer record);

    int updateByPrimaryKey(PaymentTransfer record);
}