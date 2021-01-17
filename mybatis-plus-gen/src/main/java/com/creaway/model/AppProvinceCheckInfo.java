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
 * 定制型需求省侧平台检测资料信息表（包括检测报告、app文件），只存检测通过的。
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("c_app_province_check_info")
@ApiModel(value="AppProvinceCheckInfo对象", description="定制型需求省侧平台检测资料信息表（包括检测报告、app文件），只存检测通过的。")
public class AppProvinceCheckInfo extends Model<AppProvinceCheckInfo> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "检测报告编号")
    @TableField("report_no")
    private String reportNo;

    @ApiModelProperty(value = "检测报告文件的名称")
    @TableField("report_name")
    private String reportName;

    @ApiModelProperty(value = "app安装包名称")
    @TableField("app_name")
    private String appName;

    @ApiModelProperty(value = "提交检测报告和app的省份单位的编号")
    @TableField("org_no")
    private String orgNo;

    @ApiModelProperty(value = "数据入库时间")
    @TableField("data_date")
    private LocalDateTime dataDate;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
