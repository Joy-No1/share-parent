package com.share.sharedevice.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.share.sharedevice.entity.CabinetType;
import com.share.sharedevice.service.CabinetTypeService;
import com.share.sharedevice.mapper.CabinetTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author joy
* @description 针对表【cabinet_type(柜机类型表)】的数据库操作Service实现
* @createDate 2025-03-24 20:31:58
*/
@Service
public class CabinetTypeServiceImpl extends ServiceImpl<CabinetTypeMapper, CabinetType>
    implements CabinetTypeService{

    @Autowired
    private CabinetTypeMapper cabinetTypeMapper;



}




