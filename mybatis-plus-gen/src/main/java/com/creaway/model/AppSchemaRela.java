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
 * 描述方案所包含的app
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("r_app_schema_rela")
@ApiModel(value="AppSchemaRela对象", description="描述方案所包含的app")
public class AppSchemaRela extends Model<AppSchemaRela> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "方案编号")
    @TableField("SCHEME_ID")
    private Integer schemeId;

    @ApiModelProperty(value = "app版本唯一标识")
    @TableField("APP_ID")
    private String appId;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
