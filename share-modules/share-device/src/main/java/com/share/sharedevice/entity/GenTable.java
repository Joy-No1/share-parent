package com.share.sharedevice.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 代码生成业务表
 * @TableName gen_table
 */
@TableName(value ="gen_table")
@Data
@EqualsAndHashCode
@ToString
public class GenTable implements Serializable {
    /**
     * 编号
     */
    @TableId(value = "table_id", type = IdType.AUTO)
    private Long tableId;

    /**
     * 表名称
     */
    @TableField(value = "table_name")
    private String tableName;

    /**
     * 表描述
     */
    @TableField(value = "table_comment")
    private String tableComment;

    /**
     * 关联子表的表名
     */
    @TableField(value = "sub_table_name")
    private String subTableName;

    /**
     * 子表关联的外键名
     */
    @TableField(value = "sub_table_fk_name")
    private String subTableFkName;

    /**
     * 实体类名称
     */
    @TableField(value = "class_name")
    private String className;

    /**
     * 使用的模板（crud单表操作 tree树表操作）
     */
    @TableField(value = "tpl_category")
    private String tplCategory;

    /**
     * 前端模板类型（element-ui模版 element-plus模版）
     */
    @TableField(value = "tpl_web_type")
    private String tplWebType;

    /**
     * 生成包路径
     */
    @TableField(value = "package_name")
    private String packageName;

    /**
     * 生成模块名
     */
    @TableField(value = "module_name")
    private String moduleName;

    /**
     * 生成业务名
     */
    @TableField(value = "business_name")
    private String businessName;

    /**
     * 生成功能名
     */
    @TableField(value = "function_name")
    private String functionName;

    /**
     * 生成功能作者
     */
    @TableField(value = "function_author")
    private String functionAuthor;

    /**
     * 生成代码方式（0zip压缩包 1自定义路径）
     */
    @TableField(value = "gen_type")
    private String genType;

    /**
     * 生成路径（不填默认项目路径）
     */
    @TableField(value = "gen_path")
    private String genPath;

    /**
     * 其它生成选项
     */
    @TableField(value = "options")
    private String options;

    /**
     * 创建者
     */
    @TableField(value = "create_by")
    private String createBy;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 更新者
     */
    @TableField(value = "update_by")
    private String updateBy;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;


}