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
 * 厂商的多个资质信息
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("c_manu_qualification")
@ApiModel(value="ManuQualification对象", description="厂商的多个资质信息")
public class ManuQualification extends Model<ManuQualification> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "资质名称,外部接口定义的文件名称")
    @TableField("CERTIFY_NAME")
    private String certifyName;

    @ApiModelProperty(value = "资质类型，如营业执照，资金类型。参见code_type='CERTIFY_TYPE'")
    @TableField("CERTIFY_TYPE")
    private String certifyType;

    @ApiModelProperty(value = "资质名称,外部接口定义的文件名称")
    @TableField("FILE_NAME")
    private String fileName;

    @ApiModelProperty(value = "生产时间")
    @TableField("CREATE_DATE")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "厂商ID")
    @TableField("MANU_ID")
    private String manuId;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
