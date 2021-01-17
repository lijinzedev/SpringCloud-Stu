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
 * 调用接口日志
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("l_call_log")
@ApiModel(value="CallLog对象", description="调用接口日志")
public class CallLog extends Model<CallLog> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "记录唯一标识")
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "接口类型 01总部调用  02外网调用 03 省公司调用")
    @TableField("INTER_TYPE")
    private String interType;

    @ApiModelProperty(value = "调用时间")
    @TableField("OPERATE_DATE")
    private LocalDateTime operateDate;

    @ApiModelProperty(value = "接口日志")
    @TableField("INTER_LOG")
    private String interLog;

    @ApiModelProperty(value = "调用方信息")
    @TableField("CLIENT")
    private String client;

    @ApiModelProperty(value = "被调用方信息")
    @TableField("SERVER")
    private String server;

    @ApiModelProperty(value = "接口名称")
    @TableField("INTER_NAME")
    private String interName;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
