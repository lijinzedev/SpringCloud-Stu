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
 * 角色和功能点关系，功能点指该角色对其拥有菜单的操作能力
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("r_role_permit_rela")
@ApiModel(value="RolePermitRela对象", description="角色和功能点关系，功能点指该角色对其拥有菜单的操作能力")
public class RolePermitRela extends Model<RolePermitRela> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "角色id")
    @TableField("ROLE_ID")
    private String roleId;

    @ApiModelProperty(value = "对该菜单拥有的权限ID")
    @TableField("MENU_PERMIT")
    private String menuPermit;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
