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
 * app需求表
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("f_app_demand")
@ApiModel(value="AppDemand对象", description="app需求表")
public class AppDemand extends Model<AppDemand> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "需求名称")
    @TableField("RESP_NAME")
    private String respName;

    @ApiModelProperty(value = "需求状态 参见标准代码code_type='COMMON_RESP_STATUS'和‘CUSTOMIZED_RESP_STATUS’")
    @TableField("RESP_STATUS")
    private String respStatus;

    @ApiModelProperty(value = "需求发布日期")
    @TableField("START_DATE")
    private LocalDateTime startDate;

    @ApiModelProperty(value = "需求描述")
    @TableField("RESP_DESC")
    private String respDesc;

    @ApiModelProperty(value = "需求编号")
    @TableId(value = "RESP_NO", type = IdType.NONE)
    private String respNo;

    @ApiModelProperty(value = "需求类型 CODE_TYPE='RESP_TYPE' ")
    @TableField("RESP_TYPE")
    private String respType;

    @ApiModelProperty(value = "规格说明书名称")
    @TableField("PROD_DESC")
    private String prodDesc;

    @ApiModelProperty(value = "设备类型 参见标准代码code_type='EQUIP_TYPE'")
    @TableField("EQUIP_TYPE")
    private String equipType;

    @ApiModelProperty(value = "提交人员")
    @TableField("DECLARE_PESON")
    private String declarePeson;

    @ApiModelProperty(value = "提交日期，需求创建的时间。")
    @TableField("DECLARE_DATE")
    private LocalDateTime declareDate;

    @ApiModelProperty(value = "定制型需求是否公开")
    @TableField("PUBLIC_FLAG")
    private String publicFlag;

    @ApiModelProperty(value = "定制型需求的保密期限(需求发布日期后N个月)")
    @TableField("PRIVACY_MONTHS")
    private Integer privacyMonths;

    @ApiModelProperty(value = "是否有效")
    @TableField("VALID_FLAG")
    private String validFlag;

    @ApiModelProperty(value = "审核意见")
    @TableField("CHECK_ADVICE")
    private String checkAdvice;

    @ApiModelProperty(value = "转换行为  01 未转换 02定制转通用")
    @TableField("CHANGE_ACTION")
    private String changeAction;

    @ApiModelProperty(value = "01 转换通过   02 转换不通过")
    @TableField("CHANGE_FLAG")
    private String changeFlag;

    @ApiModelProperty(value = "app名称")
    @TableField("APP_NAME")
    private String appName;

    @ApiModelProperty(value = "需求发布单位")
    @TableField("ORG_NO")
    private String orgNo;

    @ApiModelProperty(value = "转换前的定制型需求编号")
    @TableField("RESP_NO_PRE")
    private String respNoPre;

    @ApiModelProperty(value = "必装标识 '1' 必装 '0' 选装")
    @TableField("REQUIRED_FLAG")
    private String requiredFlag;

    @ApiModelProperty(value = "app分类 '01' 基础app '02' 扩展应用app")
    @TableField("APP_SORT_CODE")
    private String appSortCode;

    @ApiModelProperty(value = "app英文名称 如smiOS、mapManager")
    @TableField("APP_NAME_EN")
    private String appNameEn;

    @ApiModelProperty(value = "app名称标识 如 0001、0002")
    @TableField("NAME_CODE")
    private String nameCode;

    @ApiModelProperty(value = "是否适配手机：'0' 否  ‘1’是")
    @TableField("ADAPT_ANDROID")
    private String adaptAndroid;


    @Override
    protected Serializable pkVal() {
        return this.respNo;
    }

}
