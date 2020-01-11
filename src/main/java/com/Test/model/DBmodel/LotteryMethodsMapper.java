package com.Test.model.DBmodel;

import com.Test.model.DBmodel.LotteryMethods;
import com.Test.model.DBmodel.LotteryMethodsExample;
import com.Test.model.DBmodel.LotteryMethodsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LotteryMethodsMapper {
    long countByExample(LotteryMethodsExample example);

    int deleteByExample(LotteryMethodsExample example);

    int deleteByPrimaryKey(Integer methodsId);

    int insert(LotteryMethodsWithBLOBs record);

    int insertSelective(LotteryMethodsWithBLOBs record);

    List<LotteryMethodsWithBLOBs> selectByExampleWithBLOBs(LotteryMethodsExample example);

    List<LotteryMethods> selectByExample(LotteryMethodsExample example);

    LotteryMethodsWithBLOBs selectByPrimaryKey(Integer methodsId);

    int updateByExampleSelective(@Param("record") LotteryMethodsWithBLOBs record, @Param("example") LotteryMethodsExample example);

    int updateByExampleWithBLOBs(@Param("record") LotteryMethodsWithBLOBs record, @Param("example") LotteryMethodsExample example);

    int updateByExample(@Param("record") LotteryMethods record, @Param("example") LotteryMethodsExample example);

    int updateByPrimaryKeySelective(LotteryMethodsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(LotteryMethodsWithBLOBs record);

    int updateByPrimaryKey(LotteryMethods record);
}