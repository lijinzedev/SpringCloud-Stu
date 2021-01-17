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
 * 角色表
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("c_role")
@ApiModel(value="Role对象", description="角色表")
public class Role extends Model<Role> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ROLE_ID", type = IdType.AUTO)
    private Integer roleId;

    @ApiModelProperty(value = "创建时间")
    @TableField("CREATE_DATE")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "是否有效")
    @TableField("VALID_FLAG")
    private String validFlag;

    @ApiModelProperty(value = "角色的名称")
    @TableField("ROLE_NAME")
    private String roleName;

    @ApiModelProperty(value = "默认角色:若该角色是基础角色则不可删除。'0' 非基础角色 '1' 基础角色")
    @TableField("DEFAULT_FLAG")
    private String defaultFlag;


    @Override
    protected Serializable pkVal() {
        return this.roleId;
    }

}
