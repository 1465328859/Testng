package com.Test.model.DBmodel;

import com.Test.model.DBmodel.ExternalGameType;
import com.Test.model.DBmodel.ExternalGameTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExternalGameTypeMapper {
    long countByExample(ExternalGameTypeExample example);

    int deleteByExample(ExternalGameTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExternalGameType record);

    int insertSelective(ExternalGameType record);

    List<ExternalGameType> selectByExample(ExternalGameTypeExample example);

    ExternalGameType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExternalGameType record, @Param("example") ExternalGameTypeExample example);

    int updateByExample(@Param("record") ExternalGameType record, @Param("example") ExternalGameTypeExample example);

    int updateByPrimaryKeySelective(ExternalGameType record);

    int updateByPrimaryKey(ExternalGameType record);
}