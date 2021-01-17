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
 * 操作日志
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("l_operator_log")
@ApiModel(value="OperatorLog对象", description="操作日志")
public class OperatorLog extends Model<OperatorLog> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "记录唯一标识")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "管理单位")
    @TableField("org_no")
    private String orgNo;

    @ApiModelProperty(value = "操作日志")
    @TableField("log")
    private String log;

    @ApiModelProperty(value = "操作类型（新增修改删除查询）code_type='OPERATE_TYPE'")
    @TableField("operate_type")
    private String operateType;

    @ApiModelProperty(value = "操作内容")
    @TableField("content")
    private String content;

    @ApiModelProperty(value = "操作时间")
    @TableField("operate_date")
    private LocalDateTime operateDate;

    @ApiModelProperty(value = "客户端信息")
    @TableField("client")
    private String client;

    @ApiModelProperty(value = "菜单id")
    @TableField("menu_id")
    private String menuId;

    @ApiModelProperty(value = "操作员ID")
    @TableField("operator_id")
    private String operatorId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
