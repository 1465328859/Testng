package com.Test.model.DBmodel;

import com.Test.model.DBmodel.LotteryClassifyIntr;
import com.Test.model.DBmodel.LotteryClassifyIntrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LotteryClassifyIntrMapper {
    long countByExample(LotteryClassifyIntrExample example);

    int deleteByExample(LotteryClassifyIntrExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LotteryClassifyIntr record);

    int insertSelective(LotteryClassifyIntr record);

    List<LotteryClassifyIntr> selectByExampleWithBLOBs(LotteryClassifyIntrExample example);

    List<LotteryClassifyIntr> selectByExample(LotteryClassifyIntrExample example);

    LotteryClassifyIntr selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LotteryClassifyIntr record, @Param("example") LotteryClassifyIntrExample example);

    int updateByExampleWithBLOBs(@Param("record") LotteryClassifyIntr record, @Param("example") LotteryClassifyIntrExample example);

    int updateByExample(@Param("record") LotteryClassifyIntr record, @Param("example") LotteryClassifyIntrExample example);

    int updateByPrimaryKeySelective(LotteryClassifyIntr record);

    int updateByPrimaryKeyWithBLOBs(LotteryClassifyIntr record);

    int updateByPrimaryKey(LotteryClassifyIntr record);
}