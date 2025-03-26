package com.share.sharedevice.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.share.sharedevice.entity.Cabinet;
import com.share.sharedevice.service.CabinetService;
import com.share.sharedevice.mapper.CabinetMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author joy
* @description 针对表【cabinet(充电宝柜机表)】的数据库操作Service实现
* @createDate 2025-03-24 20:31:58
*/
@Service
public class CabinetServiceImpl extends ServiceImpl<CabinetMapper, Cabinet>
    implements CabinetService{

    @Resource
    private CabinetMapper cabinetMapper;


    @Override
    public List<Cabinet> selectListCabinet(Cabinet cabinet) {
        return cabinetMapper.selectListCabinet(cabinet);
    }
}




