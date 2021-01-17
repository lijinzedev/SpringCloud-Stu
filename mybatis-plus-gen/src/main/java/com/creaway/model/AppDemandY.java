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
@TableName("q_app_demand_y")
@ApiModel(value="AppDemandY对象", description="检测统计表")
public class AppDemandY extends Model<AppDemandY> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "app数量")
    @TableField("APP_NUM")
    private Integer appNum;

    @ApiModelProperty(value = "设备类型")
    @TableField("EQUIP_TYPE")
    private String equipType;

    @ApiModelProperty(value = "单位代码")
    @TableField("ORG_NO")
    private String orgNo;

    @ApiModelProperty(value = "app分类 '01' 基础app '02' 扩展应用app")
    @TableField("APP_SORT_CODE")
    private String appSortCode;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
