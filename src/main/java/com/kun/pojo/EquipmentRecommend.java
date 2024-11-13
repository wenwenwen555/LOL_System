package com.kun.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName lol_equipment_recommend
 */
@TableName(value ="lol_equipment_recommend")
@Data
public class EquipmentRecommend extends Base {

    private Long heroId;

    private Long equipmentId;

    private Integer recommendType;

    private Integer stage;

}