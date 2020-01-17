package com.Test.model.DBmodel;

import com.Test.model.DBmodel.GamePlayerBetMoney;
import com.Test.model.DBmodel.GamePlayerBetMoneyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GamePlayerBetMoneyMapper {
    long countByExample(GamePlayerBetMoneyExample example);

    int deleteByExample(GamePlayerBetMoneyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GamePlayerBetMoney record);

    int insertSelective(GamePlayerBetMoney record);

    List<GamePlayerBetMoney> selectByExample(GamePlayerBetMoneyExample example);

    GamePlayerBetMoney selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GamePlayerBetMoney record, @Param("example") GamePlayerBetMoneyExample example);

    int updateByExample(@Param("record") GamePlayerBetMoney record, @Param("example") GamePlayerBetMoneyExample example);

    int updateByPrimaryKeySelective(GamePlayerBetMoney record);

    int updateByPrimaryKey(GamePlayerBetMoney record);
}