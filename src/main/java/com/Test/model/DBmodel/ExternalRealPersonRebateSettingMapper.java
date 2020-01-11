package com.Test.model.DBmodel;

import com.Test.model.DBmodel.ExternalRealPersonRebateSetting;
import com.Test.model.DBmodel.ExternalRealPersonRebateSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExternalRealPersonRebateSettingMapper {
    long countByExample(ExternalRealPersonRebateSettingExample example);

    int deleteByExample(ExternalRealPersonRebateSettingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExternalRealPersonRebateSetting record);

    int insertSelective(ExternalRealPersonRebateSetting record);

    List<ExternalRealPersonRebateSetting> selectByExample(ExternalRealPersonRebateSettingExample example);

    ExternalRealPersonRebateSetting selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExternalRealPersonRebateSetting record, @Param("example") ExternalRealPersonRebateSettingExample example);

    int updateByExample(@Param("record") ExternalRealPersonRebateSetting record, @Param("example") ExternalRealPersonRebateSettingExample example);

    int updateByPrimaryKeySelective(ExternalRealPersonRebateSetting record);

    int updateByPrimaryKey(ExternalRealPersonRebateSetting record);
}