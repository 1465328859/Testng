package com.Test.model.DBmodel;

import com.Test.model.DBmodel.HelpQuestionList;
import com.Test.model.DBmodel.HelpQuestionListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HelpQuestionListMapper {
    long countByExample(HelpQuestionListExample example);

    int deleteByExample(HelpQuestionListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HelpQuestionList record);

    int insertSelective(HelpQuestionList record);

    List<HelpQuestionList> selectByExampleWithBLOBs(HelpQuestionListExample example);

    List<HelpQuestionList> selectByExample(HelpQuestionListExample example);

    HelpQuestionList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HelpQuestionList record, @Param("example") HelpQuestionListExample example);

    int updateByExampleWithBLOBs(@Param("record") HelpQuestionList record, @Param("example") HelpQuestionListExample example);

    int updateByExample(@Param("record") HelpQuestionList record, @Param("example") HelpQuestionListExample example);

    int updateByPrimaryKeySelective(HelpQuestionList record);

    int updateByPrimaryKeyWithBLOBs(HelpQuestionList record);

    int updateByPrimaryKey(HelpQuestionList record);
}