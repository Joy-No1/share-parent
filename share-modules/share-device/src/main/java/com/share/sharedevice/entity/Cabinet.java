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

/**
 * 充电宝柜机表
 * @TableName cabinet
 */
@TableName(value ="cabinet")
@Data
@Schema(name = "柜机类型")
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
    private String cabinet_no;

    /**
     * 名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 类别id
     */
    @TableField(value = "cabinet_type_id")
    private Long cabinet_type_id;

    /**
     * 总插槽数量
     */
    @TableField(value = "total_slots")
    private Integer total_slots;

    /**
     * 空闲插槽数量
     */
    @TableField(value = "free_slots")
    private Integer free_slots;

    /**
     * 已使用插槽数量
     */
    @TableField(value = "used_slots")
    private Integer used_slots;

    /**
     * 可用充电宝数量
     */
    @TableField(value = "available_num")
    private Integer available_num;

    /**
     * 描述
     */
    @TableField(value = "description")
    private String description;

    /**
     * 当前位置id
     */
    @TableField(value = "location_id")
    private Long location_id;

    /**
     * 设备id
     */
    @TableField(value = "client_id")
    private String client_id;

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
    private String del_flag;

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
        Cabinet other = (Cabinet) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCabinet_no() == null ? other.getCabinet_no() == null : this.getCabinet_no().equals(other.getCabinet_no()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCabinet_type_id() == null ? other.getCabinet_type_id() == null : this.getCabinet_type_id().equals(other.getCabinet_type_id()))
            && (this.getTotal_slots() == null ? other.getTotal_slots() == null : this.getTotal_slots().equals(other.getTotal_slots()))
            && (this.getFree_slots() == null ? other.getFree_slots() == null : this.getFree_slots().equals(other.getFree_slots()))
            && (this.getUsed_slots() == null ? other.getUsed_slots() == null : this.getUsed_slots().equals(other.getUsed_slots()))
            && (this.getAvailable_num() == null ? other.getAvailable_num() == null : this.getAvailable_num().equals(other.getAvailable_num()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getLocation_id() == null ? other.getLocation_id() == null : this.getLocation_id().equals(other.getLocation_id()))
            && (this.getClient_id() == null ? other.getClient_id() == null : this.getClient_id().equals(other.getClient_id()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getDel_flag() == null ? other.getDel_flag() == null : this.getDel_flag().equals(other.getDel_flag()))
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
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCabinet_no() == null) ? 0 : getCabinet_no().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCabinet_type_id() == null) ? 0 : getCabinet_type_id().hashCode());
        result = prime * result + ((getTotal_slots() == null) ? 0 : getTotal_slots().hashCode());
        result = prime * result + ((getFree_slots() == null) ? 0 : getFree_slots().hashCode());
        result = prime * result + ((getUsed_slots() == null) ? 0 : getUsed_slots().hashCode());
        result = prime * result + ((getAvailable_num() == null) ? 0 : getAvailable_num().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getLocation_id() == null) ? 0 : getLocation_id().hashCode());
        result = prime * result + ((getClient_id() == null) ? 0 : getClient_id().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getDel_flag() == null) ? 0 : getDel_flag().hashCode());
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
        sb.append(", id=").append(id);
        sb.append(", cabinet_no=").append(cabinet_no);
        sb.append(", name=").append(name);
        sb.append(", cabinet_type_id=").append(cabinet_type_id);
        sb.append(", total_slots=").append(total_slots);
        sb.append(", free_slots=").append(free_slots);
        sb.append(", used_slots=").append(used_slots);
        sb.append(", available_num=").append(available_num);
        sb.append(", description=").append(description);
        sb.append(", location_id=").append(location_id);
        sb.append(", client_id=").append(client_id);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", status=").append(status);
        sb.append(", del_flag=").append(del_flag);
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