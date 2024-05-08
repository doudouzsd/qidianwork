package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 小说管理对象 tb_novel
 * 
 * @author ruoyi
 * @date 2024-04-07
 */
public class TbNovel extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long novelId;

    /**  */
    @Excel(name = "")
    private Long typeId;

    /**  */
    @Excel(name = "")
    private String novelName;

    /**  */
    @Excel(name = "")
    private Long userId;

    /**  */
    @Excel(name = "")
    private String novelIntro;

    public void setNovelId(Long novelId) 
    {
        this.novelId = novelId;
    }

    public Long getNovelId() 
    {
        return novelId;
    }
    public void setTypeId(Long typeId) 
    {
        this.typeId = typeId;
    }

    public Long getTypeId() 
    {
        return typeId;
    }
    public void setNovelName(String novelName) 
    {
        this.novelName = novelName;
    }

    public String getNovelName() 
    {
        return novelName;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setNovelIntro(String novelIntro) 
    {
        this.novelIntro = novelIntro;
    }

    public String getNovelIntro() 
    {
        return novelIntro;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("novelId", getNovelId())
            .append("typeId", getTypeId())
            .append("novelName", getNovelName())
            .append("userId", getUserId())
            .append("novelIntro", getNovelIntro())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
