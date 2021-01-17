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
 * 角色菜单关系
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("r_role_menu_rela")
@ApiModel(value="RoleMenuRela对象", description="角色菜单关系")
public class RoleMenuRela extends Model<RoleMenuRela> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "角色id")
    @TableField("ROLE_ID")
    private String roleId;

    @ApiModelProperty(value = "角色可以操作的叶子菜单编号")
    @TableField("MENU_NO")
    private String menuNo;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
