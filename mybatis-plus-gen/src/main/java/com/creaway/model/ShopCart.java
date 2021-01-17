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
 * 用户app购物车
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("c_shop_cart")
@ApiModel(value="ShopCart对象", description="用户app购物车")
public class ShopCart extends Model<ShopCart> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户ID")
    @TableField("OPERATOR_ID")
    private String operatorId;

    @ApiModelProperty(value = "APP唯一标识")
    @TableField("APP_ID")
    private String appId;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
