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
 * app每次安装使用的许可编号
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("c_app_licence")
@ApiModel(value="AppLicence对象", description="app每次安装使用的许可编号")
public class AppLicence extends Model<AppLicence> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "app版本唯一标识")
    @TableField("app_id")
    private String appId;

    @ApiModelProperty(value = "订单编号")
    @TableField("order_no")
    private String orderNo;

    @ApiModelProperty(value = "esam编号清单")
    @TableField("esam_no")
    private String esamNo;

    @ApiModelProperty(value = "app数量")
    @TableField("app_nums")
    private String appNums;

    @ApiModelProperty(value = "接收总部订单的时间")
    @TableField("accept_date")
    private String acceptDate;

    @ApiModelProperty(value = "推送状态 '01'已推送 '02' 未推送")
    @TableField("push_status")
    private String pushStatus;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
