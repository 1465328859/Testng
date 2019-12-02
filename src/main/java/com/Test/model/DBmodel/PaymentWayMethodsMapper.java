package com.Test.model.DBmodel;

import com.Test.model.DBmodel.PaymentWayMethods;

public interface PaymentWayMethodsMapper {
    int deleteByPrimaryKey(Integer methodId);

    int insert(PaymentWayMethods record);

    int insertSelective(PaymentWayMethods record);

    PaymentWayMethods selectByPrimaryKey(Integer methodId);

    int updateByPrimaryKeySelective(PaymentWayMethods record);

    int updateByPrimaryKey(PaymentWayMethods record);
}