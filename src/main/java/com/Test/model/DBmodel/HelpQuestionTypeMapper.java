package com.Test.model.DBmodel;

import com.Test.model.DBmodel.HelpQuestionType;
import com.Test.model.DBmodel.HelpQuestionTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HelpQuestionTypeMapper {
    long countByExample(HelpQuestionTypeExample example);

    int deleteByExample(HelpQuestionTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HelpQuestionType record);

    int insertSelective(HelpQuestionType record);

    List<HelpQuestionType> selectByExample(HelpQuestionTypeExample example);

    HelpQuestionType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HelpQuestionType record, @Param("example") HelpQuestionTypeExample example);

    int updateByExample(@Param("record") HelpQuestionType record, @Param("example") HelpQuestionTypeExample example);

    int updateByPrimaryKeySelective(HelpQuestionType record);

    int updateByPrimaryKey(HelpQuestionType record);
}