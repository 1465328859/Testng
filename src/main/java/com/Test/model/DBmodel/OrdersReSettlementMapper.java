package com.Test.model.DBmodel;

import com.Test.model.DBmodel.OrdersReSettlement;

public interface OrdersReSettlementMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrdersReSettlement record);

    int insertSelective(OrdersReSettlement record);

    OrdersReSettlement selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrdersReSettlement record);

    int updateByPrimaryKeyWithBLOBs(OrdersReSettlement record);

    int updateByPrimaryKey(OrdersReSettlement record);
}