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
 * 菜单操作权限设置
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("c_menu_permit")
@ApiModel(value="MenuPermit对象", description="菜单操作权限设置")
public class MenuPermit extends Model<MenuPermit> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "对该菜单拥有的权限ID  ")
    @TableField("PERMIT_ID")
    private String permitId;

    @ApiModelProperty(value = "对该菜单拥有的权限名称")
    @TableField("PERMIT_NAME")
    private String permitName;

    @ApiModelProperty(value = "菜单id")
    @TableField("MENU_ID")
    private String menuId;

    @ApiModelProperty(value = "方法名")
    @TableField("FUN_NAME")
    private String funName;

    @ApiModelProperty(value = "读写功能  0读 1 写")
    @TableField("PERMIT_TYPE")
    private String permitType;

    @ApiModelProperty(value = "排序")
    @TableField("ORDER")
    private Integer order;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
