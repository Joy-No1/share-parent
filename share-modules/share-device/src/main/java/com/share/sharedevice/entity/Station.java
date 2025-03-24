package com.share.sharedevice.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 站点表
 * @TableName station
 */
@TableName(value ="station")
@Data
public class Station implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 站点名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 站点图片地址
     */
    @TableField(value = "image_url")
    private String image_url;

    /**
     * 营业时间
     */
    @TableField(value = "business_hours")
    private String business_hours;

    /**
     * 经度
     */
    @TableField(value = "longitude")
    private BigDecimal longitude;

    /**
     * 纬度
     */
    @TableField(value = "latitude")
    private BigDecimal latitude;

    /**
     * 
     */
    @TableField(value = "province_code")
    private String province_code;

    /**
     * 
     */
    @TableField(value = "city_code")
    private String city_code;

    /**
     * 
     */
    @TableField(value = "district_code")
    private String district_code;

    /**
     * 详细地址
     */
    @TableField(value = "address")
    private String address;

    /**
     * 完整地址
     */
    @TableField(value = "full_address")
    private String full_address;

    /**
     * 站点负责人名称
     */
    @TableField(value = "head_name")
    private String head_name;

    /**
     * 站点负责人电话
     */
    @TableField(value = "head_phone")
    private String head_phone;

    /**
     * 柜机id
     */
    @TableField(value = "cabinet_id")
    private Long cabinet_id;

    /**
     * 费用规则id
     */
    @TableField(value = "fee_rule_id")
    private Long fee_rule_id;

    /**
     * 状态（1正常 0停用）
     */
    @TableField(value = "status")
    private String status;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date create_time;

    /**
     * 创建者
     */
    @TableField(value = "create_by")
    private String create_by;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date update_time;

    /**
     * 更新者
     */
    @TableField(value = "update_by")
    private String update_by;

    /**
     * 删除标志（0代表存在 2代表删除）
     */
    @TableField(value = "del_flag")
    private String del_flag;

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
        Station other = (Station) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getImage_url() == null ? other.getImage_url() == null : this.getImage_url().equals(other.getImage_url()))
            && (this.getBusiness_hours() == null ? other.getBusiness_hours() == null : this.getBusiness_hours().equals(other.getBusiness_hours()))
            && (this.getLongitude() == null ? other.getLongitude() == null : this.getLongitude().equals(other.getLongitude()))
            && (this.getLatitude() == null ? other.getLatitude() == null : this.getLatitude().equals(other.getLatitude()))
            && (this.getProvince_code() == null ? other.getProvince_code() == null : this.getProvince_code().equals(other.getProvince_code()))
            && (this.getCity_code() == null ? other.getCity_code() == null : this.getCity_code().equals(other.getCity_code()))
            && (this.getDistrict_code() == null ? other.getDistrict_code() == null : this.getDistrict_code().equals(other.getDistrict_code()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getFull_address() == null ? other.getFull_address() == null : this.getFull_address().equals(other.getFull_address()))
            && (this.getHead_name() == null ? other.getHead_name() == null : this.getHead_name().equals(other.getHead_name()))
            && (this.getHead_phone() == null ? other.getHead_phone() == null : this.getHead_phone().equals(other.getHead_phone()))
            && (this.getCabinet_id() == null ? other.getCabinet_id() == null : this.getCabinet_id().equals(other.getCabinet_id()))
            && (this.getFee_rule_id() == null ? other.getFee_rule_id() == null : this.getFee_rule_id().equals(other.getFee_rule_id()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getCreate_by() == null ? other.getCreate_by() == null : this.getCreate_by().equals(other.getCreate_by()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getUpdate_by() == null ? other.getUpdate_by() == null : this.getUpdate_by().equals(other.getUpdate_by()))
            && (this.getDel_flag() == null ? other.getDel_flag() == null : this.getDel_flag().equals(other.getDel_flag()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getImage_url() == null) ? 0 : getImage_url().hashCode());
        result = prime * result + ((getBusiness_hours() == null) ? 0 : getBusiness_hours().hashCode());
        result = prime * result + ((getLongitude() == null) ? 0 : getLongitude().hashCode());
        result = prime * result + ((getLatitude() == null) ? 0 : getLatitude().hashCode());
        result = prime * result + ((getProvince_code() == null) ? 0 : getProvince_code().hashCode());
        result = prime * result + ((getCity_code() == null) ? 0 : getCity_code().hashCode());
        result = prime * result + ((getDistrict_code() == null) ? 0 : getDistrict_code().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getFull_address() == null) ? 0 : getFull_address().hashCode());
        result = prime * result + ((getHead_name() == null) ? 0 : getHead_name().hashCode());
        result = prime * result + ((getHead_phone() == null) ? 0 : getHead_phone().hashCode());
        result = prime * result + ((getCabinet_id() == null) ? 0 : getCabinet_id().hashCode());
        result = prime * result + ((getFee_rule_id() == null) ? 0 : getFee_rule_id().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getCreate_by() == null) ? 0 : getCreate_by().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getUpdate_by() == null) ? 0 : getUpdate_by().hashCode());
        result = prime * result + ((getDel_flag() == null) ? 0 : getDel_flag().hashCode());
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
        sb.append(", name=").append(name);
        sb.append(", image_url=").append(image_url);
        sb.append(", business_hours=").append(business_hours);
        sb.append(", longitude=").append(longitude);
        sb.append(", latitude=").append(latitude);
        sb.append(", province_code=").append(province_code);
        sb.append(", city_code=").append(city_code);
        sb.append(", district_code=").append(district_code);
        sb.append(", address=").append(address);
        sb.append(", full_address=").append(full_address);
        sb.append(", head_name=").append(head_name);
        sb.append(", head_phone=").append(head_phone);
        sb.append(", cabinet_id=").append(cabinet_id);
        sb.append(", fee_rule_id=").append(fee_rule_id);
        sb.append(", status=").append(status);
        sb.append(", create_time=").append(create_time);
        sb.append(", create_by=").append(create_by);
        sb.append(", update_time=").append(update_time);
        sb.append(", update_by=").append(update_by);
        sb.append(", del_flag=").append(del_flag);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}