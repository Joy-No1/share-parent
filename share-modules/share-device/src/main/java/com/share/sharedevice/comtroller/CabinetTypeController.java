package com.share.sharedevice.comtroller;

import com.share.common.core.web.controller.BaseController;
import com.share.common.core.web.page.TableDataInfo;
import com.share.sharedevice.entity.CabinetType;
import com.share.sharedevice.service.CabinetTypeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@Tag(name = "柜机类型接口管理")
@RequestMapping("/cabinetType")
public class CabinetTypeController extends BaseController {

    @Resource
    private CabinetTypeService cabinetTypeService;


    @Operation(summary = "柜机类型分页查询")
    @GetMapping("/list")
    public TableDataInfo list(CabinetType cabinetType) {
        startPage();
        List<CabinetType> list = cabinetTypeService.selectCabinetTypeList(cabinetType);
        return getDataTable(list);
    }


}
