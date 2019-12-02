package com.Test.model.DBmodel;

import com.Test.model.DBmodel.ActivityOfferList;

public interface ActivityOfferListMapper {
    int deleteByPrimaryKey(Byte id);

    int insert(ActivityOfferList record);

    int insertSelective(ActivityOfferList record);

    ActivityOfferList selectByPrimaryKey(Byte id);

    int updateByPrimaryKeySelective(ActivityOfferList record);

    int updateByPrimaryKeyWithBLOBs(ActivityOfferList record);

    int updateByPrimaryKey(ActivityOfferList record);
}