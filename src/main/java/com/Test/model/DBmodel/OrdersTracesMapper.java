package com.Test.model.DBmodel;

import com.Test.model.DBmodel.OrdersTraces;
import com.Test.model.DBmodel.OrdersTracesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdersTracesMapper {
    long countByExample(OrdersTracesExample example);

    int deleteByExample(OrdersTracesExample example);

    int deleteByPrimaryKey(Integer traceId);

    int insert(OrdersTraces record);

    int insertSelective(OrdersTraces record);

    List<OrdersTraces> selectByExample(OrdersTracesExample example);

    OrdersTraces selectByPrimaryKey(Integer traceId);

    int updateByExampleSelective(@Param("record") OrdersTraces record, @Param("example") OrdersTracesExample example);

    int updateByExample(@Param("record") OrdersTraces record, @Param("example") OrdersTracesExample example);

    int updateByPrimaryKeySelective(OrdersTraces record);

    int updateByPrimaryKey(OrdersTraces record);
}