package com.Test.model.DBmodel;

import com.Test.model.DBmodel.ExternalRealPersonGame;
import com.Test.model.DBmodel.ExternalRealPersonGameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExternalRealPersonGameMapper {
    long countByExample(ExternalRealPersonGameExample example);

    int deleteByExample(ExternalRealPersonGameExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExternalRealPersonGame record);

    int insertSelective(ExternalRealPersonGame record);

    List<ExternalRealPersonGame> selectByExample(ExternalRealPersonGameExample example);

    ExternalRealPersonGame selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExternalRealPersonGame record, @Param("example") ExternalRealPersonGameExample example);

    int updateByExample(@Param("record") ExternalRealPersonGame record, @Param("example") ExternalRealPersonGameExample example);

    int updateByPrimaryKeySelective(ExternalRealPersonGame record);

    int updateByPrimaryKey(ExternalRealPersonGame record);
}