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
 * 描述方案属性
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("c_app_schema")
@ApiModel(value="AppSchema对象", description="描述方案属性")
public class AppSchema extends Model<AppSchema> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "方案编号，自增序列")
    @TableId(value = "SCHEME_ID", type = IdType.AUTO)
    private Integer schemeId;

    @ApiModelProperty(value = "方案名称")
    @TableField("SCHEME_NAME")
    private String schemeName;

    @ApiModelProperty(value = "方案创建日期")
    @TableField("CREATE_DATE")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "方案状态0待发布1发布")
    @TableField("SCHEME_STATUS")
    private String schemeStatus;

    @ApiModelProperty(value = "方案说明")
    @TableField("INTRODUCE")
    private String introduce;

    @ApiModelProperty(value = "设备适配类型 CODE_TYPE ='EQUIP_TYPE'")
    @TableField("EQUIP_TYPE")
    private String equipType;

    @ApiModelProperty(value = "发布时间")
    @TableField("PUBLIC_DATE")
    private LocalDateTime publicDate;


    @Override
    protected Serializable pkVal() {
        return this.schemeId;
    }

}
