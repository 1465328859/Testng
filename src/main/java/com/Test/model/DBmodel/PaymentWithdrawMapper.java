package com.Test.model.DBmodel;

import com.Test.model.DBmodel.PaymentWithdraw;
import com.Test.model.DBmodel.PaymentWithdrawExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentWithdrawMapper {
    long countByExample(PaymentWithdrawExample example);

    int deleteByExample(PaymentWithdrawExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PaymentWithdraw record);

    int insertSelective(PaymentWithdraw record);

    List<PaymentWithdraw> selectByExample(PaymentWithdrawExample example);

    PaymentWithdraw selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PaymentWithdraw record, @Param("example") PaymentWithdrawExample example);

    int updateByExample(@Param("record") PaymentWithdraw record, @Param("example") PaymentWithdrawExample example);

    int updateByPrimaryKeySelective(PaymentWithdraw record);

    int updateByPrimaryKey(PaymentWithdraw record);
}