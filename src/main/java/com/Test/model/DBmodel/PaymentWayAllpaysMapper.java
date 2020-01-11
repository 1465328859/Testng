package com.Test.model.DBmodel;

import com.Test.model.DBmodel.PaymentWayAllpays;
import com.Test.model.DBmodel.PaymentWayAllpaysExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentWayAllpaysMapper {
    long countByExample(PaymentWayAllpaysExample example);

    int deleteByExample(PaymentWayAllpaysExample example);

    int deleteByPrimaryKey(Byte allpayId);

    int insert(PaymentWayAllpays record);

    int insertSelective(PaymentWayAllpays record);

    List<PaymentWayAllpays> selectByExample(PaymentWayAllpaysExample example);

    PaymentWayAllpays selectByPrimaryKey(Byte allpayId);

    int updateByExampleSelective(@Param("record") PaymentWayAllpays record, @Param("example") PaymentWayAllpaysExample example);

    int updateByExample(@Param("record") PaymentWayAllpays record, @Param("example") PaymentWayAllpaysExample example);

    int updateByPrimaryKeySelective(PaymentWayAllpays record);

    int updateByPrimaryKey(PaymentWayAllpays record);
}