package com.Test.model.DBmodel;

import com.Test.model.DBmodel.HelpFeedbackList;
import com.Test.model.DBmodel.HelpFeedbackListExample;
import com.Test.model.DBmodel.HelpFeedbackListWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HelpFeedbackListMapper {
    long countByExample(HelpFeedbackListExample example);

    int deleteByExample(HelpFeedbackListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HelpFeedbackListWithBLOBs record);

    int insertSelective(HelpFeedbackListWithBLOBs record);

    List<HelpFeedbackListWithBLOBs> selectByExampleWithBLOBs(HelpFeedbackListExample example);

    List<HelpFeedbackList> selectByExample(HelpFeedbackListExample example);

    HelpFeedbackListWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HelpFeedbackListWithBLOBs record, @Param("example") HelpFeedbackListExample example);

    int updateByExampleWithBLOBs(@Param("record") HelpFeedbackListWithBLOBs record, @Param("example") HelpFeedbackListExample example);

    int updateByExample(@Param("record") HelpFeedbackList record, @Param("example") HelpFeedbackListExample example);

    int updateByPrimaryKeySelective(HelpFeedbackListWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HelpFeedbackListWithBLOBs record);

    int updateByPrimaryKey(HelpFeedbackList record);
}