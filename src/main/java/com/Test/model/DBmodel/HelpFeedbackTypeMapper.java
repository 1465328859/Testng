package com.Test.model.DBmodel;

import com.Test.model.DBmodel.HelpFeedbackType;
import com.Test.model.DBmodel.HelpFeedbackTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HelpFeedbackTypeMapper {
    long countByExample(HelpFeedbackTypeExample example);

    int deleteByExample(HelpFeedbackTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HelpFeedbackType record);

    int insertSelective(HelpFeedbackType record);

    List<HelpFeedbackType> selectByExample(HelpFeedbackTypeExample example);

    HelpFeedbackType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HelpFeedbackType record, @Param("example") HelpFeedbackTypeExample example);

    int updateByExample(@Param("record") HelpFeedbackType record, @Param("example") HelpFeedbackTypeExample example);

    int updateByPrimaryKeySelective(HelpFeedbackType record);

    int updateByPrimaryKey(HelpFeedbackType record);
}