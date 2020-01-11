package com.Test.model.DBmodel;

import com.Test.model.DBmodel.RptLottery;
import com.Test.model.DBmodel.RptLotteryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RptLotteryMapper {
    long countByExample(RptLotteryExample example);

    int deleteByExample(RptLotteryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RptLottery record);

    int insertSelective(RptLottery record);

    List<RptLottery> selectByExampleWithBLOBs(RptLotteryExample example);

    List<RptLottery> selectByExample(RptLotteryExample example);

    RptLottery selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RptLottery record, @Param("example") RptLotteryExample example);

    int updateByExampleWithBLOBs(@Param("record") RptLottery record, @Param("example") RptLotteryExample example);

    int updateByExample(@Param("record") RptLottery record, @Param("example") RptLotteryExample example);

    int updateByPrimaryKeySelective(RptLottery record);

    int updateByPrimaryKeyWithBLOBs(RptLottery record);

    int updateByPrimaryKey(RptLottery record);
}