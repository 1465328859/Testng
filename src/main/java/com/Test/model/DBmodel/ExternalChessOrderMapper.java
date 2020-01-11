package com.Test.model.DBmodel;

import com.Test.model.DBmodel.ExternalChessOrder;
import com.Test.model.DBmodel.ExternalChessOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExternalChessOrderMapper {
    long countByExample(ExternalChessOrderExample example);

    int deleteByExample(ExternalChessOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExternalChessOrder record);

    int insertSelective(ExternalChessOrder record);

    List<ExternalChessOrder> selectByExample(ExternalChessOrderExample example);

    ExternalChessOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExternalChessOrder record, @Param("example") ExternalChessOrderExample example);

    int updateByExample(@Param("record") ExternalChessOrder record, @Param("example") ExternalChessOrderExample example);

    int updateByPrimaryKeySelective(ExternalChessOrder record);

    int updateByPrimaryKey(ExternalChessOrder record);
}