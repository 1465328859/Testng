package com.Test.model.DBmodel;

import com.Test.model.DBmodel.ExternalRealPersonGame;

public interface ExternalRealPersonGameMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExternalRealPersonGame record);

    int insertSelective(ExternalRealPersonGame record);

    ExternalRealPersonGame selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExternalRealPersonGame record);

    int updateByPrimaryKey(ExternalRealPersonGame record);
}