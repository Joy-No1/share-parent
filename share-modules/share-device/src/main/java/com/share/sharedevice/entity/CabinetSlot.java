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
 * 柜机插槽表
 * @TableName cabinet_slot
 */
@TableName(value ="cabinet_slot")
@Data
@EqualsAndHashCode
@ToString
public class CabinetSlot implements Serializable {
    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 柜机id
     */
    @TableField(value = "cabinet_id")
    private Long cabinetId;

    /**
     * 插槽编号
     */
    @TableField(value = "slot_no")
    private String slotNo;

    /**
     * 充电宝id
     */
    @TableField(value = "power_bank_id")
    private Long powerBankId;

    /**
     * 状态（1：占用 0：空闲 2：锁定）
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