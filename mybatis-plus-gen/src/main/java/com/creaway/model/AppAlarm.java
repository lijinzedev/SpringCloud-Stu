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
 * app预警信息表
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("a_app_alarm")
@ApiModel(value="AppAlarm对象", description="app预警信息表")
public class AppAlarm extends Model<AppAlarm> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "app每个版本的唯一标识")
    @TableField("APP_ID")
    private String appId;

    @ApiModelProperty(value = "预警等级")
    @TableField("ALARM_LEVEL")
    private String alarmLevel;

    @ApiModelProperty(value = "预警发起时间")
    @TableField("ALARM_DATE")
    private LocalDateTime alarmDate;

    @ApiModelProperty(value = "预警状态")
    @TableField("ALARM_STATUS")
    private String alarmStatus;

    @ApiModelProperty(value = "问题描述")
    @TableField("INFO")
    private String info;

    @ApiModelProperty(value = "预警编号 记录唯一标识")
    @TableId(value = "ALARM_NO", type = IdType.AUTO)
    private Integer alarmNo;


    @Override
    protected Serializable pkVal() {
        return this.alarmNo;
    }

}
