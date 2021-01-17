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
 * 设备资产信息
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("c_equip")
@ApiModel(value="Equip对象", description="设备资产信息")
public class Equip extends Model<Equip> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "设备资产号")
    @TableId(value = "ASSENT_NO", type = IdType.NONE)
    private String assentNo;

    @ApiModelProperty(value = "设备类型 参见标准代码code_type='EQUIP_TYPE'")
    @TableField("EQUIP_TYPE")
    private String equipType;

    @ApiModelProperty(value = "设备当前所在单位(安装单位)")
    @TableField("ORG_NO")
    private String orgNo;

    @ApiModelProperty(value = "设备生产厂商编号")
    @TableField("MANUFACTURER")
    private String manufacturer;

    @ApiModelProperty(value = "安装位置")
    @TableField("INSTALL_ADDR")
    private String installAddr;

    @ApiModelProperty(value = "ESAM序列号")
    @TableField("ESAM_NO")
    private String esamNo;

    @ApiModelProperty(value = "安装日期")
    @TableField("INSTALL_DATE")
    private LocalDateTime installDate;


    @Override
    protected Serializable pkVal() {
        return this.assentNo;
    }

}
