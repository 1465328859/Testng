package com.Test.model.DBmodel;

import com.Test.model.DBmodel.ExternalEgameOrder;

public interface ExternalEgameOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExternalEgameOrder record);

    int insertSelective(ExternalEgameOrder record);

    ExternalEgameOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExternalEgameOrder record);

    int updateByPrimaryKey(ExternalEgameOrder record);
}