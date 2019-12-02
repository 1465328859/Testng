package com.Test.model.DBmodel;

import com.Test.model.DBmodel.ExternalGameType;

public interface ExternalGameTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExternalGameType record);

    int insertSelective(ExternalGameType record);

    ExternalGameType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExternalGameType record);

    int updateByPrimaryKey(ExternalGameType record);
}