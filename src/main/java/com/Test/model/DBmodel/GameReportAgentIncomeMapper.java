package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GameReportAgentIncome;
import com.Test.model.DBmodel.GameReportAgentIncomeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameReportAgentIncomeMapper {
    long countByExample(GameReportAgentIncomeExample example);

    int deleteByExample(GameReportAgentIncomeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameReportAgentIncome record);

    int insertSelective(GameReportAgentIncome record);

    List<GameReportAgentIncome> selectByExample(GameReportAgentIncomeExample example);

    GameReportAgentIncome selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameReportAgentIncome record, @Param("example") GameReportAgentIncomeExample example);

    int updateByExample(@Param("record") GameReportAgentIncome record, @Param("example") GameReportAgentIncomeExample example);

    int updateByPrimaryKeySelective(GameReportAgentIncome record);

    int updateByPrimaryKey(GameReportAgentIncome record);
}