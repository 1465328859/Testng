package com.Test.model.DBmodel;

import com.Test.model.DBmodel.PaymentTransfer;
import com.Test.model.DBmodel.PaymentTransferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentTransferMapper {
    long countByExample(PaymentTransferExample example);

    int deleteByExample(PaymentTransferExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PaymentTransfer record);

    int insertSelective(PaymentTransfer record);

    List<PaymentTransfer> selectByExample(PaymentTransferExample example);

    PaymentTransfer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PaymentTransfer record, @Param("example") PaymentTransferExample example);

    int updateByExample(@Param("record") PaymentTransfer record, @Param("example") PaymentTransferExample example);

    int updateByPrimaryKeySelective(PaymentTransfer record);

    int updateByPrimaryKey(PaymentTransfer record);
}