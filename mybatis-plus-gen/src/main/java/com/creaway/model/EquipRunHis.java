package com.creaway.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 记录app的历史安装情况,不含最新一次安装卸载记录
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("c_equip_run_his")
@ApiModel(value="EquipRunHis对象", description="记录app的历史安装情况,不含最新一次安装卸载记录")
public class EquipRunHis extends Model<EquipRunHis> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "设备资产号")
    @TableField("ASSENT_NO")
    private String assentNo;

    @ApiModelProperty(value = "app版本的唯一标识")
    @TableField("APP_ID")
    private String appId;

    @ApiModelProperty(value = "卸载时间")
    @TableField("UNINST_DATE")
    private LocalDateTime uninstDate;

    @ApiModelProperty(value = "卸载原因")
    @TableField("UNINST_INFO")
    private String uninstInfo;

    @ApiModelProperty(value = "安装时间")
    @TableField("INST_DATE")
    private LocalDateTime instDate;

    @ApiModelProperty(value = "安装开始时间")
    @TableField("INST_START_DATE")
    private LocalDateTime instStartDate;

    @ApiModelProperty(value = "安装结束时间")
    @TableField("INST_END_DATE")
    private LocalDateTime instEndDate;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
