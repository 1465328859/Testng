package com.Test.model.DBmodel;

import com.Test.model.DBmodel.ActivityImg;

public interface ActivityImgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ActivityImg record);

    int insertSelective(ActivityImg record);

    ActivityImg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ActivityImg record);

    int updateByPrimaryKey(ActivityImg record);
}