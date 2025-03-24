package com.share.sharedevice.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

import com.share.common.core.web.domain.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 充电宝柜机表
 * @TableName cabinet
 */
@TableName(value ="cabinet")
@Data
@Schema(name = "柜机类型")
@ToString
@EqualsAndHashCode(callSuper = false)
public class Cabinet extends BaseEntity implements Serializable {
    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 机柜编号
     */
    @TableField(value = "cabinet_no")
    private String cabinetNo;

    /**
     * 名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 类别id
     */
    @TableField(value = "cabinet_type_id")
    private Long cabinetTypeId;

    /**
     * 总插槽数量
     */
    @TableField(value = "total_slots")
    private Integer totalSlots;

    /**
     * 空闲插槽数量
     */
    @TableField(value = "free_slots")
    private Integer freeSlots;

    /**
     * 已使用插槽数量
     */
    @TableField(value = "used_slots")
    private Integer usedSlots;

    /**
     * 可用充电宝数量
     */
    @TableField(value = "available_num")
    private Integer availableNum;

    /**
     * 描述
     */
    @TableField(value = "description")
    private String description;

    /**
     * 当前位置id
     */
    @TableField(value = "location_id")
    private Long locationId;

    /**
     * 设备id
     */
    @TableField(value = "client_id")
    private String clientId;

    /**
     * 用户名
     */
    @TableField(value = "username")
    private String username;

    /**
     * 密码
     */
    @TableField(value = "password")
    private String password;

    /**
     * 状态（0：未投入 1：使用中 -1：故障）
     */
    @TableField(value = "status")
    private String status;

    /**
     * 删除标志（0代表存在 2代表删除）
     */
    @TableField(value = "del_flag")
    private String delFlag;

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