package com.share.sharedevice.comtroller;


import com.share.common.core.web.controller.BaseController;
import com.share.common.core.web.domain.AjaxResult;
import com.share.common.core.web.page.TableDataInfo;
import com.share.sharedevice.entity.Cabinet;
import com.share.sharedevice.service.CabinetService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


@Tag(name = "柜机接口管理")
@RestController
@RequestMapping("/cabinet")
public class CabinetController extends BaseController {

    @Resource
    private CabinetService cabinetService;

    @Operation(summary = "查询充电宝柜机列表")
    @GetMapping("/list")
    public TableDataInfo list(Cabinet cabinet) {
        startPage();
        List<Cabinet> list = cabinetService.selectListCabinet(cabinet);
        return getDataTable(list);
    }


    @Operation(summary = "根据id查询详情")
    @GetMapping("/{id}")
    private AjaxResult getInfo(@PathVariable("id") Long id) {
        Cabinet result = cabinetService.getById(id);
        return success(result);
    }

    @Operation(summary = "新增充电宝柜机")
    @PostMapping
    public AjaxResult add(@RequestBody Cabinet cabinet) {
        return toAjax(cabinetService.save(cabinet));
    }

    @Operation(summary = "修改充电宝柜机")
    @PutMapping
    public AjaxResult edit(@RequestBody Cabinet cabinet) {
        return toAjax(cabinetService.updateById(cabinet));
    }

    @Operation(summary = "删除充电宝柜机")
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids) {
        return toAjax(cabinetService.removeBatchByIds(Arrays.asList(ids)));
    }

}

