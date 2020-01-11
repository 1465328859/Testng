package com.Test.model.DBmodel;

import com.Test.model.DBmodel.PaymentDeposits;
import com.Test.model.DBmodel.PaymentDepositsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentDepositsMapper {
    long countByExample(PaymentDepositsExample example);

    int deleteByExample(PaymentDepositsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PaymentDeposits record);

    int insertSelective(PaymentDeposits record);

    List<PaymentDeposits> selectByExample(PaymentDepositsExample example);

    PaymentDeposits selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PaymentDeposits record, @Param("example") PaymentDepositsExample example);

    int updateByExample(@Param("record") PaymentDeposits record, @Param("example") PaymentDepositsExample example);

    int updateByPrimaryKeySelective(PaymentDeposits record);

    int updateByPrimaryKey(PaymentDeposits record);
}