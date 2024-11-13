package com.kun.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
@Data
public class Base implements Serializable {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    @Version
    private Integer version;

    @TableLogic(value = "0",delval = "id")
    @TableField(fill = FieldFill.INSERT)
    private Long deleteFlag;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
}
