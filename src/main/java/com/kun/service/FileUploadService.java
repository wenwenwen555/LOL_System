package com.kun.service;

import com.kun.pojo.FileUpload;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;

/**
* @author WenHua
* @description 针对表【lol_file_upload(文件上传表)】的数据库操作Service
* @createDate 2024-11-13 21:14:37
*/
public interface FileUploadService extends IService<FileUpload> {

    Long upload(MultipartFile file);
}
