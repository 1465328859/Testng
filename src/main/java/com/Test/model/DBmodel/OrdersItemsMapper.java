package com.Test.model.DBmodel;

import com.Test.model.DBmodel.OrdersItems;
import com.Test.model.DBmodel.OrdersItemsExample;
import com.Test.model.DBmodel.OrdersItemsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdersItemsMapper {
    long countByExample(OrdersItemsExample example);

    int deleteByExample(OrdersItemsExample example);

    int deleteByPrimaryKey(Integer itemId);

    int insert(OrdersItemsWithBLOBs record);

    int insertSelective(OrdersItemsWithBLOBs record);

    List<OrdersItemsWithBLOBs> selectByExampleWithBLOBs(OrdersItemsExample example);

    List<OrdersItems> selectByExample(OrdersItemsExample example);

    OrdersItemsWithBLOBs selectByPrimaryKey(Integer itemId);

    int updateByExampleSelective(@Param("record") OrdersItemsWithBLOBs record, @Param("example") OrdersItemsExample example);

    int updateByExampleWithBLOBs(@Param("record") OrdersItemsWithBLOBs record, @Param("example") OrdersItemsExample example);

    int updateByExample(@Param("record") OrdersItems record, @Param("example") OrdersItemsExample example);

    int updateByPrimaryKeySelective(OrdersItemsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(OrdersItemsWithBLOBs record);

    int updateByPrimaryKey(OrdersItems record);
}