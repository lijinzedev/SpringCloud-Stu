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
 * 每个设备的app统计情况表，按日统计
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("q_app_usage_d")
@ApiModel(value="AppUsageD对象", description="每个设备的app统计情况表，按日统计")
public class AppUsageD extends Model<AppUsageD> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "app安装数量")
    @TableField("INST_NUM")
    private Integer instNum;

    @ApiModelProperty(value = "app版本的唯一标识")
    @TableField("APP_ID")
    private String appId;

    @ApiModelProperty(value = "日期到日 ，格式YYYYMMDD 如 ‘20200505’")
    @TableField("STAT_DAY")
    private LocalDateTime statDay;

    @ApiModelProperty(value = "app安装单位")
    @TableField("ORG_NO")
    private String orgNo;

    @ApiModelProperty(value = "app卸载数量")
    @TableField("UNINST_NUM")
    private Integer uninstNum;

    @ApiModelProperty(value = "app厂商ID")
    @TableField("APP_MANU_ID")
    private String appManuId;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
