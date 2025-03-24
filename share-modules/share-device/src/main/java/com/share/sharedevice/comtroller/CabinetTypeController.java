package com.share.sharedevice.comtroller;

import com.share.common.core.web.controller.BaseController;
import com.share.sharedevice.service.CabinetTypeService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Tag(name = "柜机类型接口管理")
@RequestMapping("/cabinetType")
public class CabinetTypeController extends BaseController {

    @Autowired
    private CabinetTypeService cabinetTypeService;



}
