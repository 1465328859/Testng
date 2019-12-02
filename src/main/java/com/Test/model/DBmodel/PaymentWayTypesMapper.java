package com.Test.model.DBmodel;

import com.Test.model.DBmodel.PaymentWayTypes;

public interface PaymentWayTypesMapper {
    int deleteByPrimaryKey(Long typeId);

    int insert(PaymentWayTypes record);

    int insertSelective(PaymentWayTypes record);

    PaymentWayTypes selectByPrimaryKey(Long typeId);

    int updateByPrimaryKeySelective(PaymentWayTypes record);

    int updateByPrimaryKey(PaymentWayTypes record);
}