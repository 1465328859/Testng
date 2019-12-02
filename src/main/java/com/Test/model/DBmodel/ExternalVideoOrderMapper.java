package com.Test.model.DBmodel;

import com.Test.model.DBmodel.ExternalVideoOrder;

public interface ExternalVideoOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExternalVideoOrder record);

    int insertSelective(ExternalVideoOrder record);

    ExternalVideoOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExternalVideoOrder record);

    int updateByPrimaryKey(ExternalVideoOrder record);
}