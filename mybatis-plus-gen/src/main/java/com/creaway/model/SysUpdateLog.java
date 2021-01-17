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
 * 系统升级日志
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("l_sys_update_log")
@ApiModel(value="SysUpdateLog对象", description="系统升级日志")
public class SysUpdateLog extends Model<SysUpdateLog> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "记录唯一标识")
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "版本号")
    @TableField("VESION_ID")
    private String vesionId;

    @ApiModelProperty(value = "发布日期")
    @TableField("PUBLIC_DATE")
    private LocalDateTime publicDate;

    @ApiModelProperty(value = "版本明细")
    @TableField("VESION_DETAIL")
    private String vesionDetail;

    @ApiModelProperty(value = "操作人用户号")
    @TableField("OPERATOR_ID")
    private String operatorId;

    @ApiModelProperty(value = "操作时间")
    @TableField("OPERATE_DATE")
    private LocalDateTime operateDate;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
