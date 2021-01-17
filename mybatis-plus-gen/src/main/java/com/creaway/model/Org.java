package com.creaway.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
 * 单位信息表
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("c_org")
@ApiModel(value="Org对象", description="单位信息表")
public class Org extends Model<Org> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "记录唯一标识")
    @TableField("ORG_NO")
    private String orgNo;

    @ApiModelProperty(value = "单位名称")
    @TableField("ORG_NAME")
    private String orgName;

    @ApiModelProperty(value = "上级单位代码")
    @TableField("P_ORG_NO")
    private String pOrgNo;

    @ApiModelProperty(value = "单位类别:国网、省、地市、区县、分公司、地市")
    @TableField("ORG_TYPE")
    private String orgType;

    @ApiModelProperty(value = "记录是否有效 '01'有效' 02'无效")
    @TableField("VALID_FLAG")
    private String validFlag;

    @ApiModelProperty(value = "统计级别")
    @TableField("STAT_TYPE")
    private String statType;

    @ApiModelProperty(value = "单位简写")
    @TableField("SHORT_NO")
    private String shortNo;

    @ApiModelProperty(value = "单位名称的缩写（如：杭州 ）（非必须，前可先不加，有需求再加）")
    @TableField("SHOT_NAME")
    private String shotName;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
