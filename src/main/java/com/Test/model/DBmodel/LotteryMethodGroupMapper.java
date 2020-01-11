package com.Test.model.DBmodel;

import com.Test.model.DBmodel.LotteryMethodGroup;
import com.Test.model.DBmodel.LotteryMethodGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LotteryMethodGroupMapper {
    long countByExample(LotteryMethodGroupExample example);

    int deleteByExample(LotteryMethodGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LotteryMethodGroup record);

    int insertSelective(LotteryMethodGroup record);

    List<LotteryMethodGroup> selectByExample(LotteryMethodGroupExample example);

    LotteryMethodGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LotteryMethodGroup record, @Param("example") LotteryMethodGroupExample example);

    int updateByExample(@Param("record") LotteryMethodGroup record, @Param("example") LotteryMethodGroupExample example);

    int updateByPrimaryKeySelective(LotteryMethodGroup record);

    int updateByPrimaryKey(LotteryMethodGroup record);
}