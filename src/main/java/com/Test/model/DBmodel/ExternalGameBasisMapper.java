package com.Test.model.DBmodel;

import com.Test.model.DBmodel.ExternalGameBasis;
import com.Test.model.DBmodel.ExternalGameBasisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExternalGameBasisMapper {
    long countByExample(ExternalGameBasisExample example);

    int deleteByExample(ExternalGameBasisExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExternalGameBasis record);

    int insertSelective(ExternalGameBasis record);

    List<ExternalGameBasis> selectByExample(ExternalGameBasisExample example);

    ExternalGameBasis selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExternalGameBasis record, @Param("example") ExternalGameBasisExample example);

    int updateByExample(@Param("record") ExternalGameBasis record, @Param("example") ExternalGameBasisExample example);

    int updateByPrimaryKeySelective(ExternalGameBasis record);

    int updateByPrimaryKey(ExternalGameBasis record);
}