package com.kun.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName lol_equipment
 */
@TableName(value ="lol_equipment")
@Data
public class Equipment extends Base {

    private String name;

    private Long imgFileId;

}