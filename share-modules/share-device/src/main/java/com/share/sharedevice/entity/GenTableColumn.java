package com.share.sharedevice.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 代码生成业务表字段
 * @TableName gen_table_column
 */
@TableName(value ="gen_table_column")
@Data
public class GenTableColumn implements Serializable {
    /**
     * 编号
     */
    @TableId(value = "column_id", type = IdType.AUTO)
    private Long column_id;

    /**
     * 归属表编号
     */
    @TableField(value = "table_id")
    private Long table_id;

    /**
     * 列名称
     */
    @TableField(value = "column_name")
    private String column_name;

    /**
     * 列描述
     */
    @TableField(value = "column_comment")
    private String column_comment;

    /**
     * 列类型
     */
    @TableField(value = "column_type")
    private String column_type;

    /**
     * JAVA类型
     */
    @TableField(value = "java_type")
    private String java_type;

    /**
     * JAVA字段名
     */
    @TableField(value = "java_field")
    private String java_field;

    /**
     * 是否主键（1是）
     */
    @TableField(value = "is_pk")
    private String is_pk;

    /**
     * 是否自增（1是）
     */
    @TableField(value = "is_increment")
    private String is_increment;

    /**
     * 是否必填（1是）
     */
    @TableField(value = "is_required")
    private String is_required;

    /**
     * 是否为插入字段（1是）
     */
    @TableField(value = "is_insert")
    private String is_insert;

    /**
     * 是否编辑字段（1是）
     */
    @TableField(value = "is_edit")
    private String is_edit;

    /**
     * 是否列表字段（1是）
     */
    @TableField(value = "is_list")
    private String is_list;

    /**
     * 是否查询字段（1是）
     */
    @TableField(value = "is_query")
    private String is_query;

    /**
     * 查询方式（等于、不等于、大于、小于、范围）
     */
    @TableField(value = "query_type")
    private String query_type;

    /**
     * 显示类型（文本框、文本域、下拉框、复选框、单选框、日期控件）
     */
    @TableField(value = "html_type")
    private String html_type;

    /**
     * 字典类型
     */
    @TableField(value = "dict_type")
    private String dict_type;

    /**
     * 排序
     */
    @TableField(value = "sort")
    private Integer sort;

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
        GenTableColumn other = (GenTableColumn) that;
        return (this.getColumn_id() == null ? other.getColumn_id() == null : this.getColumn_id().equals(other.getColumn_id()))
            && (this.getTable_id() == null ? other.getTable_id() == null : this.getTable_id().equals(other.getTable_id()))
            && (this.getColumn_name() == null ? other.getColumn_name() == null : this.getColumn_name().equals(other.getColumn_name()))
            && (this.getColumn_comment() == null ? other.getColumn_comment() == null : this.getColumn_comment().equals(other.getColumn_comment()))
            && (this.getColumn_type() == null ? other.getColumn_type() == null : this.getColumn_type().equals(other.getColumn_type()))
            && (this.getJava_type() == null ? other.getJava_type() == null : this.getJava_type().equals(other.getJava_type()))
            && (this.getJava_field() == null ? other.getJava_field() == null : this.getJava_field().equals(other.getJava_field()))
            && (this.getIs_pk() == null ? other.getIs_pk() == null : this.getIs_pk().equals(other.getIs_pk()))
            && (this.getIs_increment() == null ? other.getIs_increment() == null : this.getIs_increment().equals(other.getIs_increment()))
            && (this.getIs_required() == null ? other.getIs_required() == null : this.getIs_required().equals(other.getIs_required()))
            && (this.getIs_insert() == null ? other.getIs_insert() == null : this.getIs_insert().equals(other.getIs_insert()))
            && (this.getIs_edit() == null ? other.getIs_edit() == null : this.getIs_edit().equals(other.getIs_edit()))
            && (this.getIs_list() == null ? other.getIs_list() == null : this.getIs_list().equals(other.getIs_list()))
            && (this.getIs_query() == null ? other.getIs_query() == null : this.getIs_query().equals(other.getIs_query()))
            && (this.getQuery_type() == null ? other.getQuery_type() == null : this.getQuery_type().equals(other.getQuery_type()))
            && (this.getHtml_type() == null ? other.getHtml_type() == null : this.getHtml_type().equals(other.getHtml_type()))
            && (this.getDict_type() == null ? other.getDict_type() == null : this.getDict_type().equals(other.getDict_type()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getCreate_by() == null ? other.getCreate_by() == null : this.getCreate_by().equals(other.getCreate_by()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_by() == null ? other.getUpdate_by() == null : this.getUpdate_by().equals(other.getUpdate_by()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getColumn_id() == null) ? 0 : getColumn_id().hashCode());
        result = prime * result + ((getTable_id() == null) ? 0 : getTable_id().hashCode());
        result = prime * result + ((getColumn_name() == null) ? 0 : getColumn_name().hashCode());
        result = prime * result + ((getColumn_comment() == null) ? 0 : getColumn_comment().hashCode());
        result = prime * result + ((getColumn_type() == null) ? 0 : getColumn_type().hashCode());
        result = prime * result + ((getJava_type() == null) ? 0 : getJava_type().hashCode());
        result = prime * result + ((getJava_field() == null) ? 0 : getJava_field().hashCode());
        result = prime * result + ((getIs_pk() == null) ? 0 : getIs_pk().hashCode());
        result = prime * result + ((getIs_increment() == null) ? 0 : getIs_increment().hashCode());
        result = prime * result + ((getIs_required() == null) ? 0 : getIs_required().hashCode());
        result = prime * result + ((getIs_insert() == null) ? 0 : getIs_insert().hashCode());
        result = prime * result + ((getIs_edit() == null) ? 0 : getIs_edit().hashCode());
        result = prime * result + ((getIs_list() == null) ? 0 : getIs_list().hashCode());
        result = prime * result + ((getIs_query() == null) ? 0 : getIs_query().hashCode());
        result = prime * result + ((getQuery_type() == null) ? 0 : getQuery_type().hashCode());
        result = prime * result + ((getHtml_type() == null) ? 0 : getHtml_type().hashCode());
        result = prime * result + ((getDict_type() == null) ? 0 : getDict_type().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getCreate_by() == null) ? 0 : getCreate_by().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_by() == null) ? 0 : getUpdate_by().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", column_id=").append(column_id);
        sb.append(", table_id=").append(table_id);
        sb.append(", column_name=").append(column_name);
        sb.append(", column_comment=").append(column_comment);
        sb.append(", column_type=").append(column_type);
        sb.append(", java_type=").append(java_type);
        sb.append(", java_field=").append(java_field);
        sb.append(", is_pk=").append(is_pk);
        sb.append(", is_increment=").append(is_increment);
        sb.append(", is_required=").append(is_required);
        sb.append(", is_insert=").append(is_insert);
        sb.append(", is_edit=").append(is_edit);
        sb.append(", is_list=").append(is_list);
        sb.append(", is_query=").append(is_query);
        sb.append(", query_type=").append(query_type);
        sb.append(", html_type=").append(html_type);
        sb.append(", dict_type=").append(dict_type);
        sb.append(", sort=").append(sort);
        sb.append(", create_by=").append(create_by);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_by=").append(update_by);
        sb.append(", update_time=").append(update_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}