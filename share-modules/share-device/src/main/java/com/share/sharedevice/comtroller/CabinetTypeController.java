package com.share.sharedevice.comtroller;

import com.share.common.core.web.controller.BaseController;
import com.share.common.core.web.domain.AjaxResult;
import com.share.common.core.web.page.TableDataInfo;
import com.share.sharedevice.entity.CabinetType;
import com.share.sharedevice.service.CabinetTypeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
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

    @Operation(summary = "根据id查询详情")
    @GetMapping("/{id}")
    public AjaxResult getCabinetTypeById(@PathVariable("id") Long id) {
        return success(cabinetTypeService.getById(id));
    }

    @Operation(summary = "添加柜机类型")
    @PostMapping
    public AjaxResult add(@RequestBody CabinetType cabinetType) {
        boolean save = cabinetTypeService.save(cabinetType);
        return toAjax(save);
    }

    @Operation(summary = "修改柜机类型")
    @PutMapping
    public AjaxResult update(@RequestBody CabinetType cabinetType) {
        boolean update = cabinetTypeService.updateById(cabinetType);
        return toAjax(update);
    }

    @Operation(summary = "删除柜机类型")
    @DeleteMapping("/{ids}")
    public AjaxResult deleteBatchList(@PathVariable Long[] ids) {
        if (ids != null && ids.length > 0) {
            boolean result = cabinetTypeService.removeBatchByIds(Arrays.asList(ids));
            return toAjax(result);
        }
        return toAjax(true);
    }

    @Operation(summary = "查询全部柜机类型列表")
    @GetMapping("/getCabinetTypeList")
    public AjaxResult getCabinetTypeList() {
        return success(cabinetTypeService.list());
    }


}
