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
 * 记录数据库存储过程执行情况
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("l_db_err_log")
@ApiModel(value="DbErrLog对象", description="记录数据库存储过程执行情况")
public class DbErrLog extends Model<DbErrLog> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "记录标识")
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "mysql错误代码")
    @TableField("RETURNED_SQLSTATE")
    private String returnedSqlstate;

    @ApiModelProperty(value = "mysql错误描述")
    @TableField("MESSAGE_TEXT")
    private String messageText;

    @ApiModelProperty(value = "日志时间")
    @TableField("DATA_TIME")
    private LocalDateTime dataTime;

    @ApiModelProperty(value = "对象名")
    @TableField("OBJ_NAME")
    private String objName;

    @ApiModelProperty(value = "数据库名")
    @TableField("DB_NAME")
    private String dbName;

    @ApiModelProperty(value = "参数信息")
    @TableField("PARAM_NIFO")
    private String paramNifo;

    @ApiModelProperty(value = "‘1’成功'0'失败")
    @TableField("EXEC_FLAG")
    private String execFlag;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
