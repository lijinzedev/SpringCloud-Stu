package com.creaway.model;

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
 * app送检委托表
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("f_app_check")
@ApiModel(value="AppCheck对象", description="app送检委托表")
public class AppCheck extends Model<AppCheck> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "检测报告编号(省测检测报告)")
    @TableId(value = "REPORT_NO", type = IdType.NONE)
    private String reportNo;

    @ApiModelProperty(value = "APP类型，分通用型， 定制型。参见code_type='APP_TYPE'")
    @TableField("APP_TYPE")
    private String appType;

    @ApiModelProperty(value = "提交厂商id")
    @TableField("DECLARE_MANU_ID")
    private String declareManuId;

    @ApiModelProperty(value = "提交检测日期")
    @TableField("DECLARE_DATE")
    private LocalDateTime declareDate;

    @ApiModelProperty(value = "需求编号")
    @TableField("RESP_NO")
    private String respNo;

    @ApiModelProperty(value = "app安装包名称")
    @TableField("APP_NAME")
    private String appName;

    @ApiModelProperty(value = "送检委托的app版本")
    @TableField("APP_VERSION")
    private String appVersion;

    @ApiModelProperty(value = "操作系统版本")
    @TableField("OS_VERSION")
    private String osVersion;

    @ApiModelProperty(value = "APP简介")
    @TableField("APP_INTRO")
    private String appIntro;

    @ApiModelProperty(value = "单位编号")
    @TableField("ORG_NO")
    private String orgNo;

    @ApiModelProperty(value = "检测报告文件的名称")
    @TableField("REPORT_NAME")
    private String reportName;

    @ApiModelProperty(value = "数据入库时间")
    @TableField("DATA_DATE")
    private LocalDateTime dataDate;


    @Override
    protected Serializable pkVal() {
        return this.reportNo;
    }

}
