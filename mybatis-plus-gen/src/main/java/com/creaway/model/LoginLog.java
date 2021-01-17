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
 * 登陆日志
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("l_login_log")
@ApiModel(value="LoginLog对象", description="登陆日志")
public class LoginLog extends Model<LoginLog> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "记录唯一标识")
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "单位")
    @TableField("ORG_NO")
    private String orgNo;

    @ApiModelProperty(value = "操作时间")
    @TableField("OPERATE_DATE")
    private LocalDateTime operateDate;

    @ApiModelProperty(value = "客户端")
    @TableField("CLIENT")
    private String client;

    @ApiModelProperty(value = "用户号")
    @TableField("OPERATOR_ID")
    private String operatorId;

    @ApiModelProperty(value = "操作信息")
    @TableField("CONTENT")
    private String content;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
