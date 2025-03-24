package com.share.sharedevice.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 代码生成业务表
 * @TableName gen_table
 */
@TableName(value ="gen_table")
@Data
public class GenTable implements Serializable {
    /**
     * 编号
     */
    @TableId(value = "table_id", type = IdType.AUTO)
    private Long table_id;

    /**
     * 表名称
     */
    @TableField(value = "table_name")
    private String table_name;

    /**
     * 表描述
     */
    @TableField(value = "table_comment")
    private String table_comment;

    /**
     * 关联子表的表名
     */
    @TableField(value = "sub_table_name")
    private String sub_table_name;

    /**
     * 子表关联的外键名
     */
    @TableField(value = "sub_table_fk_name")
    private String sub_table_fk_name;

    /**
     * 实体类名称
     */
    @TableField(value = "class_name")
    private String class_name;

    /**
     * 使用的模板（crud单表操作 tree树表操作）
     */
    @TableField(value = "tpl_category")
    private String tpl_category;

    /**
     * 前端模板类型（element-ui模版 element-plus模版）
     */
    @TableField(value = "tpl_web_type")
    private String tpl_web_type;

    /**
     * 生成包路径
     */
    @TableField(value = "package_name")
    private String package_name;

    /**
     * 生成模块名
     */
    @TableField(value = "module_name")
    private String module_name;

    /**
     * 生成业务名
     */
    @TableField(value = "business_name")
    private String business_name;

    /**
     * 生成功能名
     */
    @TableField(value = "function_name")
    private String function_name;

    /**
     * 生成功能作者
     */
    @TableField(value = "function_author")
    private String function_author;

    /**
     * 生成代码方式（0zip压缩包 1自定义路径）
     */
    @TableField(value = "gen_type")
    private String gen_type;

    /**
     * 生成路径（不填默认项目路径）
     */
    @TableField(value = "gen_path")
    private String gen_path;

    /**
     * 其它生成选项
     */
    @TableField(value = "options")
    private String options;

    /**
     * 创建者
     */
    @TableField(value = "create_by")
    private String create_by;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date create_time;

    /**
     * 更新者
     */
    @TableField(value = "update_by")
    private String update_by;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date update_time;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        GenTable other = (GenTable) that;
        return (this.getTable_id() == null ? other.getTable_id() == null : this.getTable_id().equals(other.getTable_id()))
            && (this.getTable_name() == null ? other.getTable_name() == null : this.getTable_name().equals(other.getTable_name()))
            && (this.getTable_comment() == null ? other.getTable_comment() == null : this.getTable_comment().equals(other.getTable_comment()))
            && (this.getSub_table_name() == null ? other.getSub_table_name() == null : this.getSub_table_name().equals(other.getSub_table_name()))
            && (this.getSub_table_fk_name() == null ? other.getSub_table_fk_name() == null : this.getSub_table_fk_name().equals(other.getSub_table_fk_name()))
            && (this.getClass_name() == null ? other.getClass_name() == null : this.getClass_name().equals(other.getClass_name()))
            && (this.getTpl_category() == null ? other.getTpl_category() == null : this.getTpl_category().equals(other.getTpl_category()))
            && (this.getTpl_web_type() == null ? other.getTpl_web_type() == null : this.getTpl_web_type().equals(other.getTpl_web_type()))
            && (this.getPackage_name() == null ? other.getPackage_name() == null : this.getPackage_name().equals(other.getPackage_name()))
            && (this.getModule_name() == null ? other.getModule_name() == null : this.getModule_name().equals(other.getModule_name()))
            && (this.getBusiness_name() == null ? other.getBusiness_name() == null : this.getBusiness_name().equals(other.getBusiness_name()))
            && (this.getFunction_name() == null ? other.getFunction_name() == null : this.getFunction_name().equals(other.getFunction_name()))
            && (this.getFunction_author() == null ? other.getFunction_author() == null : this.getFunction_author().equals(other.getFunction_author()))
            && (this.getGen_type() == null ? other.getGen_type() == null : this.getGen_type().equals(other.getGen_type()))
            && (this.getGen_path() == null ? other.getGen_path() == null : this.getGen_path().equals(other.getGen_path()))
            && (this.getOptions() == null ? other.getOptions() == null : this.getOptions().equals(other.getOptions()))
            && (this.getCreate_by() == null ? other.getCreate_by() == null : this.getCreate_by().equals(other.getCreate_by()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_by() == null ? other.getUpdate_by() == null : this.getUpdate_by().equals(other.getUpdate_by()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTable_id() == null) ? 0 : getTable_id().hashCode());
        result = prime * result + ((getTable_name() == null) ? 0 : getTable_name().hashCode());
        result = prime * result + ((getTable_comment() == null) ? 0 : getTable_comment().hashCode());
        result = prime * result + ((getSub_table_name() == null) ? 0 : getSub_table_name().hashCode());
        result = prime * result + ((getSub_table_fk_name() == null) ? 0 : getSub_table_fk_name().hashCode());
        result = prime * result + ((getClass_name() == null) ? 0 : getClass_name().hashCode());
        result = prime * result + ((getTpl_category() == null) ? 0 : getTpl_category().hashCode());
        result = prime * result + ((getTpl_web_type() == null) ? 0 : getTpl_web_type().hashCode());
        result = prime * result + ((getPackage_name() == null) ? 0 : getPackage_name().hashCode());
        result = prime * result + ((getModule_name() == null) ? 0 : getModule_name().hashCode());
        result = prime * result + ((getBusiness_name() == null) ? 0 : getBusiness_name().hashCode());
        result = prime * result + ((getFunction_name() == null) ? 0 : getFunction_name().hashCode());
        result = prime * result + ((getFunction_author() == null) ? 0 : getFunction_author().hashCode());
        result = prime * result + ((getGen_type() == null) ? 0 : getGen_type().hashCode());
        result = prime * result + ((getGen_path() == null) ? 0 : getGen_path().hashCode());
        result = prime * result + ((getOptions() == null) ? 0 : getOptions().hashCode());
        result = prime * result + ((getCreate_by() == null) ? 0 : getCreate_by().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_by() == null) ? 0 : getUpdate_by().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", table_id=").append(table_id);
        sb.append(", table_name=").append(table_name);
        sb.append(", table_comment=").append(table_comment);
        sb.append(", sub_table_name=").append(sub_table_name);
        sb.append(", sub_table_fk_name=").append(sub_table_fk_name);
        sb.append(", class_name=").append(class_name);
        sb.append(", tpl_category=").append(tpl_category);
        sb.append(", tpl_web_type=").append(tpl_web_type);
        sb.append(", package_name=").append(package_name);
        sb.append(", module_name=").append(module_name);
        sb.append(", business_name=").append(business_name);
        sb.append(", function_name=").append(function_name);
        sb.append(", function_author=").append(function_author);
        sb.append(", gen_type=").append(gen_type);
        sb.append(", gen_path=").append(gen_path);
        sb.append(", options=").append(options);
        sb.append(", create_by=").append(create_by);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_by=").append(update_by);
        sb.append(", update_time=").append(update_time);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}