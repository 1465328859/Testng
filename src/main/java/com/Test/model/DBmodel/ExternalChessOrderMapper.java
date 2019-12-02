package com.Test.model.DBmodel;

import com.Test.model.DBmodel.ExternalChessOrder;

public interface ExternalChessOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExternalChessOrder record);

    int insertSelective(ExternalChessOrder record);

    ExternalChessOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExternalChessOrder record);

    int updateByPrimaryKey(ExternalChessOrder record);
}