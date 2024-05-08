package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TbNovelMapper;
import com.ruoyi.system.domain.TbNovel;
import com.ruoyi.system.service.ITbNovelService;

/**
 * 小说管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-04-07
 */
@Service
@DataSource(DataSourceType.SLAVE)
public class TbNovelServiceImpl implements ITbNovelService 
{
    @Autowired
    private TbNovelMapper tbNovelMapper;

    /**
     * 查询小说管理
     * 
     * @param novelId 小说管理主键
     * @return 小说管理
     */
    @Override
    public TbNovel selectTbNovelByNovelId(Long novelId)
    {
        return tbNovelMapper.selectTbNovelByNovelId(novelId);
    }

    /**
     * 查询小说管理列表
     * 
     * @param tbNovel 小说管理
     * @return 小说管理
     */
    @Override
    public List<TbNovel> selectTbNovelList(TbNovel tbNovel)
    {
        return tbNovelMapper.selectTbNovelList(tbNovel);
    }

    /**
     * 新增小说管理
     * 
     * @param tbNovel 小说管理
     * @return 结果
     */
    @Override
    public int insertTbNovel(TbNovel tbNovel)
    {
        tbNovel.setCreateTime(DateUtils.getNowDate());
        return tbNovelMapper.insertTbNovel(tbNovel);
    }

    /**
     * 修改小说管理
     * 
     * @param tbNovel 小说管理
     * @return 结果
     */
    @Override
    public int updateTbNovel(TbNovel tbNovel)
    {
        tbNovel.setUpdateTime(DateUtils.getNowDate());
        return tbNovelMapper.updateTbNovel(tbNovel);
    }

    /**
     * 批量删除小说管理
     * 
     * @param novelIds 需要删除的小说管理主键
     * @return 结果
     */
    @Override
    public int deleteTbNovelByNovelIds(Long[] novelIds)
    {
        return tbNovelMapper.deleteTbNovelByNovelIds(novelIds);
    }

    /**
     * 删除小说管理信息
     * 
     * @param novelId 小说管理主键
     * @return 结果
     */
    @Override
    public int deleteTbNovelByNovelId(Long novelId)
    {
        return tbNovelMapper.deleteTbNovelByNovelId(novelId);
    }
}
