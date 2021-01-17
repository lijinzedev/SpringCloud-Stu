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
 * 用户问卷评价表信息
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("c_eval_info")
@ApiModel(value="EvalInfo对象", description="用户问卷评价表信息")
public class EvalInfo extends Model<EvalInfo> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "问卷编号，记录唯一标识")
    @TableId(value = "EVAL_NO", type = IdType.AUTO)
    private Integer evalNo;

    @ApiModelProperty(value = "问卷名称")
    @TableField("EVAL_NAME")
    private String evalName;

    @ApiModelProperty(value = "问卷模板编号")
    @TableField("TEMPLATE_NO")
    private String templateNo;

    @ApiModelProperty(value = "问卷填报对象。如厂商ID等，多个对象使用分隔符分隔")
    @TableField("RESPONDENT")
    private String respondent;

    @ApiModelProperty(value = "接收时间")
    @TableField("START_DATE")
    private LocalDateTime startDate;

    @ApiModelProperty(value = "结束时间")
    @TableField("END_DATE")
    private LocalDateTime endDate;

    @ApiModelProperty(value = "问卷状态 '02' 填报中 '03'已完成")
    @TableField("STATUS")
    private String status;

    @ApiModelProperty(value = "被问卷的app对应版本ID")
    @TableField("APP_ID")
    private String appId;

    @ApiModelProperty(value = "填报对象类型 '01' 设备厂商 '02' 省公司")
    @TableField("RESPONDENT_TYPE")
    private String respondentType;


    @Override
    protected Serializable pkVal() {
        return this.evalNo;
    }

}
