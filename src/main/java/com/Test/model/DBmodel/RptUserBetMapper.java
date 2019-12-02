package com.Test.model.DBmodel;

import com.Test.model.DBmodel.RptUserBet;

public interface RptUserBetMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RptUserBet record);

    int insertSelective(RptUserBet record);

    RptUserBet selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RptUserBet record);

    int updateByPrimaryKey(RptUserBet record);
}