package com.Test.model.DBmodel;

import com.Test.model.DBmodel.OrdersReSettlement;
import com.Test.model.DBmodel.OrdersReSettlementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdersReSettlementMapper {
    long countByExample(OrdersReSettlementExample example);

    int deleteByExample(OrdersReSettlementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrdersReSettlement record);

    int insertSelective(OrdersReSettlement record);

    List<OrdersReSettlement> selectByExampleWithBLOBs(OrdersReSettlementExample example);

    List<OrdersReSettlement> selectByExample(OrdersReSettlementExample example);

    OrdersReSettlement selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrdersReSettlement record, @Param("example") OrdersReSettlementExample example);

    int updateByExampleWithBLOBs(@Param("record") OrdersReSettlement record, @Param("example") OrdersReSettlementExample example);

    int updateByExample(@Param("record") OrdersReSettlement record, @Param("example") OrdersReSettlementExample example);

    int updateByPrimaryKeySelective(OrdersReSettlement record);

    int updateByPrimaryKeyWithBLOBs(OrdersReSettlement record);

    int updateByPrimaryKey(OrdersReSettlement record);
}