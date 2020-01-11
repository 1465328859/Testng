package com.Test.model.DBmodel;

import com.Test.model.DBmodel.PaymentGoldCoin;
import com.Test.model.DBmodel.PaymentGoldCoinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentGoldCoinMapper {
    long countByExample(PaymentGoldCoinExample example);

    int deleteByExample(PaymentGoldCoinExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PaymentGoldCoin record);

    int insertSelective(PaymentGoldCoin record);

    List<PaymentGoldCoin> selectByExample(PaymentGoldCoinExample example);

    PaymentGoldCoin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PaymentGoldCoin record, @Param("example") PaymentGoldCoinExample example);

    int updateByExample(@Param("record") PaymentGoldCoin record, @Param("example") PaymentGoldCoinExample example);

    int updateByPrimaryKeySelective(PaymentGoldCoin record);

    int updateByPrimaryKey(PaymentGoldCoin record);
}