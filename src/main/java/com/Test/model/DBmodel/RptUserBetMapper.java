package com.Test.model.DBmodel;

import com.Test.model.DBmodel.RptUserBet;
import com.Test.model.DBmodel.RptUserBetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RptUserBetMapper {
    long countByExample(RptUserBetExample example);

    int deleteByExample(RptUserBetExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RptUserBet record);

    int insertSelective(RptUserBet record);

    List<RptUserBet> selectByExample(RptUserBetExample example);

    RptUserBet selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RptUserBet record, @Param("example") RptUserBetExample example);

    int updateByExample(@Param("record") RptUserBet record, @Param("example") RptUserBetExample example);

    int updateByPrimaryKeySelective(RptUserBet record);

    int updateByPrimaryKey(RptUserBet record);
}