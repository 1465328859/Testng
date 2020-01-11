package com.Test.model.DBmodel;

import com.Test.model.DBmodel.RptGradePresent;
import com.Test.model.DBmodel.RptGradePresentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RptGradePresentMapper {
    long countByExample(RptGradePresentExample example);

    int deleteByExample(RptGradePresentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RptGradePresent record);

    int insertSelective(RptGradePresent record);

    List<RptGradePresent> selectByExample(RptGradePresentExample example);

    RptGradePresent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RptGradePresent record, @Param("example") RptGradePresentExample example);

    int updateByExample(@Param("record") RptGradePresent record, @Param("example") RptGradePresentExample example);

    int updateByPrimaryKeySelective(RptGradePresent record);

    int updateByPrimaryKey(RptGradePresent record);
}