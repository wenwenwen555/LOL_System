package com.kun.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName lol_hero
 */
@TableName(value ="lol_hero")
@Data
public class Hero extends Base {

    private String name;

    private Long imgFileId;

}