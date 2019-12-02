package com.Test.model.DBmodel;

import com.Test.model.DBmodel.ExternalRealPersonRebateSetting;

public interface ExternalRealPersonRebateSettingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExternalRealPersonRebateSetting record);

    int insertSelective(ExternalRealPersonRebateSetting record);

    ExternalRealPersonRebateSetting selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExternalRealPersonRebateSetting record);

    int updateByPrimaryKey(ExternalRealPersonRebateSetting record);
}