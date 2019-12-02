package com.Test.model.DBmodel;

import com.Test.model.DBmodel.OrdersItems;
import com.Test.model.DBmodel.OrdersItemsWithBLOBs;

public interface OrdersItemsMapper {
    int deleteByPrimaryKey(Integer itemId);

    int insert(OrdersItemsWithBLOBs record);

    int insertSelective(OrdersItemsWithBLOBs record);

    OrdersItemsWithBLOBs selectByPrimaryKey(Integer itemId);

    int updateByPrimaryKeySelective(OrdersItemsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(OrdersItemsWithBLOBs record);

    int updateByPrimaryKey(OrdersItems record);
}