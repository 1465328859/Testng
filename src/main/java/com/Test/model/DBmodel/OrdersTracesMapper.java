package com.Test.model.DBmodel;

import com.Test.model.DBmodel.OrdersTraces;

public interface OrdersTracesMapper {
    int deleteByPrimaryKey(Integer traceId);

    int insert(OrdersTraces record);

    int insertSelective(OrdersTraces record);

    OrdersTraces selectByPrimaryKey(Integer traceId);

    int updateByPrimaryKeySelective(OrdersTraces record);

    int updateByPrimaryKey(OrdersTraces record);
}