package com.Test.model.DBmodel;

import com.Test.model.DBmodel.PaymentWayTypes;
import com.Test.model.DBmodel.PaymentWayTypesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentWayTypesMapper {
    long countByExample(PaymentWayTypesExample example);

    int deleteByExample(PaymentWayTypesExample example);

    int deleteByPrimaryKey(Long typeId);

    int insert(PaymentWayTypes record);

    int insertSelective(PaymentWayTypes record);

    List<PaymentWayTypes> selectByExample(PaymentWayTypesExample example);

    PaymentWayTypes selectByPrimaryKey(Long typeId);

    int updateByExampleSelective(@Param("record") PaymentWayTypes record, @Param("example") PaymentWayTypesExample example);

    int updateByExample(@Param("record") PaymentWayTypes record, @Param("example") PaymentWayTypesExample example);

    int updateByPrimaryKeySelective(PaymentWayTypes record);

    int updateByPrimaryKey(PaymentWayTypes record);
}