package com.kun.controller;

import com.kun.service.FileUploadService;
import com.kun.utils.Result;
import com.kun.utils.ResultVO;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/file")
public class FileController {
    @Autowired
    private FileUploadService fileUploadService;
    @PostMapping(value = "/upload" ,consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResultVO upload(@RequestPart MultipartFile file){
        Long fileId = fileUploadService.upload(file);
        return ResultVO.success(fileId);
    }
}
