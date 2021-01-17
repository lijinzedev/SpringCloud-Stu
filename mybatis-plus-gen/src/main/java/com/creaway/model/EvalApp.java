package com.creaway.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
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
 * app评价表
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("c_eval_app")
@ApiModel(value="EvalApp对象", description="app评价表")
public class EvalApp extends Model<EvalApp> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "app的唯一标识")
    @TableField("APP_ID")
    private String appId;

    @ApiModelProperty(value = "用户评价星级")
    @TableField("EVAL_STARS")
    private Integer evalStars;

    @ApiModelProperty(value = "用户评价明细，评价具体内容")
    @TableField("EVAL_DETAIL")
    private String evalDetail;

    @ApiModelProperty(value = "编号,如厂商ID、省公司代码")
    @TableField("OPERATOR_ID")
    private String operatorId;

    @ApiModelProperty(value = "评价生成日期")
    @TableField("EVAL_DATE")
    private LocalDate evalDate;

    @ApiModelProperty(value = "'01' 厂商ID(外网) '02' 省公司（内网）")
    @TableField("OPERATOR_TYPE")
    private String operatorType;

    @ApiModelProperty(value = "订单ID")
    @TableField("ORDER_ID")
    private String orderId;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
