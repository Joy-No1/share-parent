package com.share.sharedevice.mapper;

import com.share.sharedevice.entity.Cabinet;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author joy
* @description 针对表【cabinet(充电宝柜机表)】的数据库操作Mapper
* @createDate 2025-03-24 20:31:58
* @Entity com.share.sharedevice.entity.Cabinet
*/
public interface CabinetMapper extends BaseMapper<Cabinet> {

    List<Cabinet> selectListCabinet(Cabinet cabinet);
}




