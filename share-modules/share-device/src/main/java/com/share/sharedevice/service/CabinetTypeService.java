package com.share.sharedevice.service;

import com.share.sharedevice.entity.CabinetType;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author joy
* @description 针对表【cabinet_type(柜机类型表)】的数据库操作Service
* @createDate 2025-03-24 20:31:58
*/
public interface CabinetTypeService extends IService<CabinetType> {

    /**
     * 柜机类型分页方法
     * @param cabinetType 查询参数
     * @return List<CabinetType>
     */
    List<CabinetType> selectCabinetTypeList(CabinetType cabinetType);
}
