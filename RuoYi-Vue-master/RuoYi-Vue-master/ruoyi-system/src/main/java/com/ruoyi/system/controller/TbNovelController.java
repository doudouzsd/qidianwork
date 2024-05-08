package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.TbNovel;
import com.ruoyi.system.service.ITbNovelService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 小说管理Controller
 * 
 * @author ruoyi
 * @date 2024-04-07
 */
@RestController
@RequestMapping("/system/novel")
public class TbNovelController extends BaseController
{
    @Autowired
    private ITbNovelService tbNovelService;

    /**
     * 查询小说管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:novel:list')")
    @GetMapping("/list")
    public TableDataInfo list(TbNovel tbNovel)
    {
        startPage();
        List<TbNovel> list = tbNovelService.selectTbNovelList(tbNovel);
        return getDataTable(list);
    }

    /**
     * 导出小说管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:novel:export')")
    @Log(title = "小说管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TbNovel tbNovel)
    {
        List<TbNovel> list = tbNovelService.selectTbNovelList(tbNovel);
        ExcelUtil<TbNovel> util = new ExcelUtil<TbNovel>(TbNovel.class);
        util.exportExcel(response, list, "小说管理数据");
    }

    /**
     * 获取小说管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:novel:query')")
    @GetMapping(value = "/{novelId}")
    public AjaxResult getInfo(@PathVariable("novelId") Long novelId)
    {
        return success(tbNovelService.selectTbNovelByNovelId(novelId));
    }

    /**
     * 新增小说管理
     */
    @PreAuthorize("@ss.hasPermi('system:novel:add')")
    @Log(title = "小说管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TbNovel tbNovel)
    {
        return toAjax(tbNovelService.insertTbNovel(tbNovel));
    }

    /**
     * 修改小说管理
     */
    @PreAuthorize("@ss.hasPermi('system:novel:edit')")
    @Log(title = "小说管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TbNovel tbNovel)
    {
        return toAjax(tbNovelService.updateTbNovel(tbNovel));
    }

    /**
     * 删除小说管理
     */
    @PreAuthorize("@ss.hasPermi('system:novel:remove')")
    @Log(title = "小说管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{novelIds}")
    public AjaxResult remove(@PathVariable Long[] novelIds)
    {
        return toAjax(tbNovelService.deleteTbNovelByNovelIds(novelIds));
    }
}
