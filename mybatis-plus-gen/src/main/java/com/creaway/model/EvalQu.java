package com.creaway.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
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
 * 
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("c_eval_qu")
@ApiModel(value="EvalQu对象", description="")
public class EvalQu extends Model<EvalQu> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "模板编号")
    @TableField("TEMPLATE_NO")
    private Integer templateNo;

    @ApiModelProperty(value = "问题编号，每个模板中的问题编号，与模板编号组成唯一标识")
    @TableField("QU_NO")
    private Integer quNo;

    @ApiModelProperty(value = "问题的答案，选项题则是否被选中 '0' 未选中 '1'选中 ，简答题则为简答内容")
    @TableField("QU_ANSWER")
    private String quAnswer;

    @ApiModelProperty(value = "问卷编号")
    @TableField("EVAL_NO")
    private Integer evalNo;

    @ApiModelProperty(value = "填报对象:问卷回答人，谁回答显示谁，每份问卷的单个对象")
    @TableField("RESPONDENT")
    private String respondent;

    @ApiModelProperty(value = "问题填报日期")
    @TableField("FILL_DATE")
    private LocalDate fillDate;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
