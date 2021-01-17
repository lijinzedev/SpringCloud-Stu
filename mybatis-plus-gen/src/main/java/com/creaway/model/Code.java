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
 * 数据字典表：存储代码具体值 。
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("p_code")
@ApiModel(value="Code对象", description="数据字典表：存储代码具体值 。")
public class Code extends Model<Code> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "记录唯一标识")
    @TableId(value = "CODE_ID", type = IdType.AUTO)
    private Integer codeId;

    @ApiModelProperty(value = "'父类唯一标识';")
    @TableField("CODE_SORT_ID")
    private Integer codeSortId;

    @ApiModelProperty(value = "代码名称")
    @TableField("code_NAME")
    private String codeName;

    @ApiModelProperty(value = "代码分类标识")
    @TableField("CODE_TYPE")
    private String codeType;

    @ApiModelProperty(value = "编码值")
    @TableField("code_VALUE")
    private String codeValue;

    @ApiModelProperty(value = "维护人员")
    @TableField("MAINT_PERSON")
    private String maintPerson;

    @ApiModelProperty(value = "显示序号")
    @TableField("DISP_SN")
    private Integer dispSn;

    @ApiModelProperty(value = "是否有效 '0'无效 '1'有效")
    @TableField("VALID_FLAG")
    private String validFlag;

    @ApiModelProperty(value = "创建日期")
    @TableField("EFFECT_DATE")
    private LocalDateTime effectDate;

    @ApiModelProperty(value = "备选字段1")
    @TableField("CONTENT1")
    private String content1;

    @ApiModelProperty(value = "备选字段2")
    @TableField("CONTENT2")
    private String content2;


    @Override
    protected Serializable pkVal() {
        return this.codeId;
    }

}
