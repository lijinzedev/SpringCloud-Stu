package com.creaway.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
 * 检测统计表
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("q_app_stat")
@ApiModel(value="AppStat对象", description="检测统计表")
public class AppStat extends Model<AppStat> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "年份 格式YYYYMMDD 如 ‘202000101’")
    @TableField("STAT_YEAR")
    private String statYear;

    @ApiModelProperty(value = "app数量")
    @TableField("APP_NUM")
    private Integer appNum;

    @ApiModelProperty(value = "设备类型")
    @TableField("EQUIP_TYPE")
    private String equipType;

    @ApiModelProperty(value = "单位代码")
    @TableField("ORG_NO")
    private String orgNo;

    @ApiModelProperty(value = "需求类型 CODE_TYPE='RESP_TYPE' ")
    @TableField("RESP_TYPE")
    private String respType;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
