package com.Test.model.DBmodel;

import com.Test.model.DBmodel.PaymentWayAllpays;

public interface PaymentWayAllpaysMapper {
    int deleteByPrimaryKey(Byte allpayId);

    int insert(PaymentWayAllpays record);

    int insertSelective(PaymentWayAllpays record);

    PaymentWayAllpays selectByPrimaryKey(Byte allpayId);

    int updateByPrimaryKeySelective(PaymentWayAllpays record);

    int updateByPrimaryKey(PaymentWayAllpays record);
}