package com.Test.model.DBmodel;

import com.Test.model.DBmodel.PaymentWayMethods;
import com.Test.model.DBmodel.PaymentWayMethodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentWayMethodsMapper {
    long countByExample(PaymentWayMethodsExample example);

    int deleteByExample(PaymentWayMethodsExample example);

    int deleteByPrimaryKey(Integer methodId);

    int insert(PaymentWayMethods record);

    int insertSelective(PaymentWayMethods record);

    List<PaymentWayMethods> selectByExample(PaymentWayMethodsExample example);

    PaymentWayMethods selectByPrimaryKey(Integer methodId);

    int updateByExampleSelective(@Param("record") PaymentWayMethods record, @Param("example") PaymentWayMethodsExample example);

    int updateByExample(@Param("record") PaymentWayMethods record, @Param("example") PaymentWayMethodsExample example);

    int updateByPrimaryKeySelective(PaymentWayMethods record);

    int updateByPrimaryKey(PaymentWayMethods record);
}