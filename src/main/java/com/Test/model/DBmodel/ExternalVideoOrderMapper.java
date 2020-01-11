package com.Test.model.DBmodel;

import com.Test.model.DBmodel.ExternalVideoOrder;
import com.Test.model.DBmodel.ExternalVideoOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExternalVideoOrderMapper {
    long countByExample(ExternalVideoOrderExample example);

    int deleteByExample(ExternalVideoOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExternalVideoOrder record);

    int insertSelective(ExternalVideoOrder record);

    List<ExternalVideoOrder> selectByExample(ExternalVideoOrderExample example);

    ExternalVideoOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExternalVideoOrder record, @Param("example") ExternalVideoOrderExample example);

    int updateByExample(@Param("record") ExternalVideoOrder record, @Param("example") ExternalVideoOrderExample example);

    int updateByPrimaryKeySelective(ExternalVideoOrder record);

    int updateByPrimaryKey(ExternalVideoOrder record);
}