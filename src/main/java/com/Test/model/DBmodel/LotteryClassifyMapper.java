package com.Test.model.DBmodel;

import com.Test.model.DBmodel.LotteryClassify;
import com.Test.model.DBmodel.LotteryClassifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LotteryClassifyMapper {
    long countByExample(LotteryClassifyExample example);

    int deleteByExample(LotteryClassifyExample example);

    int deleteByPrimaryKey(Integer lotteryClassifyId);

    int insert(LotteryClassify record);

    int insertSelective(LotteryClassify record);

    List<LotteryClassify> selectByExampleWithBLOBs(LotteryClassifyExample example);

    List<LotteryClassify> selectByExample(LotteryClassifyExample example);

    LotteryClassify selectByPrimaryKey(Integer lotteryClassifyId);

    int updateByExampleSelective(@Param("record") LotteryClassify record, @Param("example") LotteryClassifyExample example);

    int updateByExampleWithBLOBs(@Param("record") LotteryClassify record, @Param("example") LotteryClassifyExample example);

    int updateByExample(@Param("record") LotteryClassify record, @Param("example") LotteryClassifyExample example);

    int updateByPrimaryKeySelective(LotteryClassify record);

    int updateByPrimaryKeyWithBLOBs(LotteryClassify record);

    int updateByPrimaryKey(LotteryClassify record);
}