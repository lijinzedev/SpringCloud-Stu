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
 * 菜单表
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("c_menu")
@ApiModel(value="Menu对象", description="菜单表")
public class Menu extends Model<Menu> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "菜单编号")
    @TableId(value = "MENU_NO", type = IdType.NONE)
    private String menuNo;

    @ApiModelProperty(value = "本菜单的上级")
    @TableField("MENU_PRE")
    private String menuPre;

    @ApiModelProperty(value = "菜单名称")
    @TableField("MENU_NAME")
    private String menuName;

    @ApiModelProperty(value = "菜单路径")
    @TableField("MENU_PATH")
    private String menuPath;

    @ApiModelProperty(value = "菜单级别")
    @TableField("MENU_LEVEL")
    private String menuLevel;

    @ApiModelProperty(value = "是否叶子菜单")
    @TableField("IS_LEAF")
    private String isLeaf;

    @ApiModelProperty(value = "菜单显示序列")
    @TableField("MENU_SEQ")
    private String menuSeq;

    @ApiModelProperty(value = "前端Comment(组件)")
    @TableField("COMPONENT")
    private String component;

    @ApiModelProperty(value = "菜单的icon_class(CSS样式)")
    @TableField("ICON")
    private String icon;


    @Override
    protected Serializable pkVal() {
        return this.menuNo;
    }

}
