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
 * 用户表
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("c_operator")
@ApiModel(value="Operator对象", description="用户表")
public class Operator extends Model<Operator> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "OPERATOR_ID", type = IdType.NONE)
    private String operatorId;

    @ApiModelProperty(value = "用户名")
    @TableField("OPERATOR_NAME")
    private String operatorName;

    @ApiModelProperty(value = "单位")
    @TableField("ORG_NO")
    private String orgNo;

    @ApiModelProperty(value = "部门")
    @TableField("DEPT_NO")
    private String deptNo;

    @ApiModelProperty(value = "密码")
    @TableField("PASS")
    private String pass;

    @ApiModelProperty(value = "创建时间")
    @TableField("CREATE_DATE")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "注销时间")
    @TableField("CANCEL_DATE")
    private LocalDateTime cancelDate;

    @ApiModelProperty(value = "是否有效")
    @TableField("VALID_FLAG")
    private String validFlag;

    @ApiModelProperty(value = "联系方式")
    @TableField("TELPHONE")
    private String telphone;

    @TableField("REAL_NAME")
    private String realName;


    @Override
    protected Serializable pkVal() {
        return this.operatorId;
    }

}
