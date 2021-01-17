package com.creaway.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
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
 * 部门信息表
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("c_department")
@ApiModel(value="Department对象", description="部门信息表")
public class Department extends Model<Department> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "部门编码,记录唯一标识")
    @TableField("DEPT_NO")
    private String deptNo;

    @ApiModelProperty(value = "部门名称")
    @TableField("DEPT_NAME")
    private String deptName;

    @ApiModelProperty(value = "上级部门编码")
    @TableField("PRE_DEPT_NO")
    private String preDeptNo;

    @ApiModelProperty(value = "是否有效 '0' 无效 '1' 有效")
    @TableField("VALID_FLAG")
    private String validFlag;

    @ApiModelProperty(value = "维护时间")
    @TableField("OPERATOR_DATE")
    private LocalDateTime operatorDate;

    @ApiModelProperty(value = "部门所属单位机构，如财务部属于XX公司")
    @TableField("ORGAN_NO")
    private String organNo;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
