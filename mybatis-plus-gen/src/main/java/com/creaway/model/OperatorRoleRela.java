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
 * 用户角色关系表
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("r_operator_role_rela")
@ApiModel(value="OperatorRoleRela对象", description="用户角色关系表")
public class OperatorRoleRela extends Model<OperatorRoleRela> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户号")
    @TableField("OPERATOR_ID")
    private String operatorId;

    @ApiModelProperty(value = "角色ID")
    @TableField("ROLE_ID")
    private String roleId;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
