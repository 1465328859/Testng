package com.Test.model.DBmodel;

import com.Test.model.DBmodel.ExternalEgameOrder;
import com.Test.model.DBmodel.ExternalEgameOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExternalEgameOrderMapper {
    long countByExample(ExternalEgameOrderExample example);

    int deleteByExample(ExternalEgameOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExternalEgameOrder record);

    int insertSelective(ExternalEgameOrder record);

    List<ExternalEgameOrder> selectByExample(ExternalEgameOrderExample example);

    ExternalEgameOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExternalEgameOrder record, @Param("example") ExternalEgameOrderExample example);

    int updateByExample(@Param("record") ExternalEgameOrder record, @Param("example") ExternalEgameOrderExample example);

    int updateByPrimaryKeySelective(ExternalEgameOrder record);

    int updateByPrimaryKey(ExternalEgameOrder record);
}