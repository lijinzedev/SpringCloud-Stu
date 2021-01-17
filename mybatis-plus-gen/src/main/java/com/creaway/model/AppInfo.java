package com.creaway.model;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * app信息表
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("c_app_info")
@ApiModel(value="AppInfo对象", description="app信息表")
public class AppInfo extends Model<AppInfo> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "app_Id 随版本变动")
    @TableId(value = "APP_ID", type = IdType.NONE)
    private String appId;

    @ApiModelProperty(value = "app编号不跟随版本变动，唯一标识")
    @TableField("APP_NO")
    private String appNo;

    @ApiModelProperty(value = "名称")
    @TableField("APP_NAME")
    private String appName;

    @ApiModelProperty(value = "状态 code_type ='APP_STATUS'")
    @TableField("APP_STATUS")
    private String appStatus;

    @ApiModelProperty(value = "状态时间")
    @TableField("APP_DATE")
    private LocalDateTime appDate;

    @ApiModelProperty(value = "类型  CODE_TYPE='APP_TYPE' ")
    @TableField("APP_TYPE")
    private String appType;

    @ApiModelProperty(value = "开发商id")
    @TableField("MANU_ID")
    private String manuId;

    @ApiModelProperty(value = "设备适配类型 CODE_TYPE ='EQUIP_TYPE'")
    @TableField("EQUIP_TYPE")
    private String equipType;

    @ApiModelProperty(value = "简介")
    @TableField("INTRODUCE")
    private String introduce;

    @ApiModelProperty(value = "版本")
    @TableField("VERSION")
    private String version;

    @ApiModelProperty(value = "上架时间")
    @TableField("PRODUCT_PUB")
    private LocalDateTime productPub;

    @ApiModelProperty(value = "app的图标标识")
    @TableField("ICON_ID")
    private String iconId;

    @ApiModelProperty(value = "上架标识 1 已上架 0 未上架")
    @TableField("SOLD_FLAG")
    private String soldFlag;

    @ApiModelProperty(value = "是否为最新版本 1 是 0 否")
    @TableField("VESION_FLAG")
    private String vesionFlag;

    @ApiModelProperty(value = "app发布的时间")
    @TableField("PUBLIC_DATE")
    private LocalDateTime publicDate;

    @ApiModelProperty(value = "必装标识 '1' 必装 '0' 选装")
    @TableField("REQUIRED_FLAG")
    private String requiredFlag;

    @ApiModelProperty(value = "app分类 '01' 基础app '02' 扩展应用app")
    @TableField("APP_SORT_CODE")
    private String appSortCode;

    @ApiModelProperty(value = "综合评价")
    @TableField("APP_EVAL")
    private Double appEval;

    @ApiModelProperty(value = "操作系统唯一标识")
    @TableField("OS_VERSION")
    private String osVersion;

    @ApiModelProperty(value = "检测报告编号")
    @TableField("REPORT_NO")
    private String reportNo;

    @ApiModelProperty(value = "售价")
    @TableField("USE_COST")
    private BigDecimal useCost;

    @ApiModelProperty(value = "安装包大小")
    @TableField("APP_PKG_SIZE")
    private Double appPkgSize;

    @ApiModelProperty(value = "版本描述")
    @TableField("APP_VERINTRO")
    private String appVerintro;


    @Override
    protected Serializable pkVal() {
        return this.appId;
    }

}
