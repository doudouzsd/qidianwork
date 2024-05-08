package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.TbNovel;

/**
 * 小说管理Service接口
 * 
 * @author ruoyi
 * @date 2024-04-07
 */
public interface ITbNovelService 
{
    /**
     * 查询小说管理
     * 
     * @param novelId 小说管理主键
     * @return 小说管理
     */
    public TbNovel selectTbNovelByNovelId(Long novelId);

    /**
     * 查询小说管理列表
     * 
     * @param tbNovel 小说管理
     * @return 小说管理集合
     */
    public List<TbNovel> selectTbNovelList(TbNovel tbNovel);

    /**
     * 新增小说管理
     * 
     * @param tbNovel 小说管理
     * @return 结果
     */
    public int insertTbNovel(TbNovel tbNovel);

    /**
     * 修改小说管理
     * 
     * @param tbNovel 小说管理
     * @return 结果
     */
    public int updateTbNovel(TbNovel tbNovel);

    /**
     * 批量删除小说管理
     * 
     * @param novelIds 需要删除的小说管理主键集合
     * @return 结果
     */
    public int deleteTbNovelByNovelIds(Long[] novelIds);

    /**
     * 删除小说管理信息
     * 
     * @param novelId 小说管理主键
     * @return 结果
     */
    public int deleteTbNovelByNovelId(Long novelId);
}
