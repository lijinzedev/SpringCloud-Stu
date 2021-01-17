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
 * 厂商信息表
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("c_manufacturer")
@ApiModel(value="Manufacturer对象", description="厂商信息表")
public class Manufacturer extends Model<Manufacturer> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "厂商id,一个厂商注册一次对应一个ID")
    @TableField("MANU_ID")
    private String manuId;

    @ApiModelProperty(value = "厂商简称")
    @TableField("MANU_NAME")
    private String manuName;

    @ApiModelProperty(value = "联系人")
    @TableField("TEL_PERSON")
    private String telPerson;

    @ApiModelProperty(value = "联系方式")
    @TableField("TEL_NO")
    private String telNo;

    @ApiModelProperty(value = "企业邮箱")
    @TableField("EMAIL")
    private String email;

    @ApiModelProperty(value = "注册时间")
    @TableField("REGIST_DATE")
    private LocalDateTime registDate;

    @ApiModelProperty(value = "通讯地址")
    @TableField("ADDR")
    private String addr;

    @ApiModelProperty(value = "厂商统一会社信用代码")
    @TableField("CREDIT_CODE")
    private String creditCode;

    @ApiModelProperty(value = "本次注册的联系人邮箱")
    @TableField("PERSON_EMAIL")
    private String personEmail;

    @ApiModelProperty(value = "本次注册的联系人通讯地址")
    @TableField("PERSON_ADDR")
    private String personAddr;

    @ApiModelProperty(value = "厂商名称")
    @TableField("MANU_FULL_NAME")
    private String manuFullName;

    @ApiModelProperty(value = "厂商编码")
    @TableField("MANU_NO")
    private String manuNo;

    @ApiModelProperty(value = "厂商代码，由厂商编码的十六进制")
    @TableField("MANU_NO_HEX")
    private String manuNoHex;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
