package com.kun.service.impl;

import cn.hutool.core.io.FileUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kun.exception.BizException;
import com.kun.pojo.FileUpload;
import com.kun.service.FileUploadService;
import com.kun.mapper.FileUploadMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;

/**
* @author WenHua
* @description 针对表【lol_file_upload(文件上传表)】的数据库操作Service实现
* @createDate 2024-11-13 21:14:37
*/
@Service
@Slf4j
public class FileUploadServiceImpl extends ServiceImpl<FileUploadMapper, FileUpload>
    implements FileUploadService{

    @Value("${file.dir}")
    private String fileDir;

    @Override
    public Long upload(MultipartFile file) {
        String originalFilename = file.getOriginalFilename();
        String mainName = FileUtil.mainName(originalFilename);
        String extName = FileUtil.extName(originalFilename);
        String fileName = mainName + "_" + UUID.randomUUID() + "." + extName;

        String absolutePath = fileDir + fileName;

        try {
            FileUtil.writeBytes(file.getBytes(), absolutePath);
        } catch (IOException e) {
            log.error("文件上传失败：{}",e.getMessage());
            throw BizException.of("文件上传失败");
        }
        FileUpload fileUpload = new FileUpload();
        fileUpload.setName(fileName);
        fileUpload.setPath(absolutePath);
        save(fileUpload);
        return fileUpload.getId();
    }
}




