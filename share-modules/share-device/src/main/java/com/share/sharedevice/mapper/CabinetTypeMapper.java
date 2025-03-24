package com.share.sharedevice.mapper;

import com.share.sharedevice.entity.CabinetType;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author joy
* @description 针对表【cabinet_type(柜机类型表)】的数据库操作Mapper
* @createDate 2025-03-24 20:31:58
* @Entity com.share.sharedevice.entity.CabinetType
*/
public interface CabinetTypeMapper extends BaseMapper<CabinetType> {

    List<CabinetType> selectCabinetTypeList(CabinetType cabinetType);
}




