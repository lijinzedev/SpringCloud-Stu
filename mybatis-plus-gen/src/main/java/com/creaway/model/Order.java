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
 * 子订单表
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("c_order")
@ApiModel(value="Order对象", description="子订单表")
public class Order extends Model<Order> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "订单名称")
    @TableField("ORDER_NAME")
    private String orderName;

    @ApiModelProperty(value = "订单编号")
    @TableId(value = "ORDER_NO", type = IdType.NONE)
    private String orderNo;

    @ApiModelProperty(value = "订单状态 '00'待添加设备 '01' 待提交 '02'进行中 03 已完成")
    @TableField("ORDER_STATUS")
    private String orderStatus;

    @ApiModelProperty(value = "状态时间")
    @TableField("STATUS_DATE")
    private LocalDateTime statusDate;

    @ApiModelProperty(value = "订单生成日期")
    @TableField("DECLARE_DATE")
    private LocalDateTime declareDate;

    @ApiModelProperty(value = "订单创建人单位")
    @TableField("ORG_NO")
    private String orgNo;

    @ApiModelProperty(value = "订单创建人")
    @TableField("OPERATOR_ID")
    private String operatorId;

    @ApiModelProperty(value = "方案编号")
    @TableField("SCHEME_ID")
    private Integer schemeId;


    @Override
    protected Serializable pkVal() {
        return this.orderNo;
    }

}
