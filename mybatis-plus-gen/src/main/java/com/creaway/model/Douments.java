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
 * 资料信息表
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("c_douments")
@ApiModel(value="Douments对象", description="资料信息表")
public class Douments extends Model<Douments> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "资料类型")
    @TableField("DOC_TYPE")
    private String docType;

    @ApiModelProperty(value = "资料名称")
    @TableField("DOC_NAME")
    private String docName;

    @ApiModelProperty(value = "资料编号")
    @TableId(value = "DOC_NO", type = IdType.NONE)
    private String docNo;

    @ApiModelProperty(value = "资料简介")
    @TableField("DOC_DESCRIBE")
    private String docDescribe;

    @ApiModelProperty(value = "上传人员用户号")
    @TableField("OPERATOR_ID")
    private String operatorId;

    @ApiModelProperty(value = "上传时间")
    @TableField("CREATE_DATE")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "文件名称")
    @TableField("FILE_NAME")
    private String fileName;


    @Override
    protected Serializable pkVal() {
        return this.docNo;
    }

}
