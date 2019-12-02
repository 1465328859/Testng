package com.Test.model.DBmodel;

import com.Test.model.DBmodel.SysNotice;

public interface SysNoticeMapper {
    int deleteByPrimaryKey(Byte id);

    int insert(SysNotice record);

    int insertSelective(SysNotice record);

    SysNotice selectByPrimaryKey(Byte id);

    int updateByPrimaryKeySelective(SysNotice record);

    int updateByPrimaryKeyWithBLOBs(SysNotice record);

    int updateByPrimaryKey(SysNotice record);
}