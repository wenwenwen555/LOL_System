package com.kun.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName lol_file_upload
 */
@TableName(value ="lol_file_upload")
@Data
public class FileUpload extends Base {

    private String name;

    private String path;

}