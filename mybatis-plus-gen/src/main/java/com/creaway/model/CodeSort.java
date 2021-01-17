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
 * 数据字典，存储代码大类
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("p_code_sort")
@ApiModel(value="CodeSort对象", description="数据字典，存储代码大类")
public class CodeSort extends Model<CodeSort> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "记录唯一标识")
    @TableId(value = "CODE_SORT_ID", type = IdType.AUTO)
    private Integer codeSortId;

    @ApiModelProperty(value = "编码名称")
    @TableField("CODE_NAME")
    private String codeName;

    @ApiModelProperty(value = "维护人员")
    @TableField("MAINT_PERSON")
    private String maintPerson;

    @ApiModelProperty(value = "创建日期")
    @TableField("EFFECT_DATE")
    private LocalDateTime effectDate;

    @ApiModelProperty(value = "是否有效 '0'无效 '1'有效")
    @TableField("VALID_FLAG")
    private String validFlag;

    @ApiModelProperty(value = "代码分类标识")
    @TableField("CODE_TYPE")
    private String codeType;


    @Override
    protected Serializable pkVal() {
        return this.codeSortId;
    }

}
