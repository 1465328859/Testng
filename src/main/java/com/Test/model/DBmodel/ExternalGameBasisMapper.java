package com.Test.model.DBmodel;

import com.Test.model.DBmodel.ExternalGameBasis;

public interface ExternalGameBasisMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExternalGameBasis record);

    int insertSelective(ExternalGameBasis record);

    ExternalGameBasis selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExternalGameBasis record);

    int updateByPrimaryKey(ExternalGameBasis record);
}