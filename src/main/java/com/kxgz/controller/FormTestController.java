package com.kxgz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * 文件上传
 */
@Controller
public class FormTestController {

    /**
     * MultipartFile 自动封装上传过来的文件
     *
     * @param email
     * @param username
     * @param headerImg
     * @param photos
     * @return
     */
    @PostMapping("/upload")
    public String upload(@RequestParam("email") String email,
                         @RequestParam("username") String username,
                         @RequestPart("headerImg") MultipartFile headerImg,
                         @RequestPart("headerImg") MultipartFile[] photos) throws IOException {

        if (!headerImg.isEmpty()) {
            //保存本地
            String originalFilename = headerImg.getOriginalFilename();
            headerImg.transferTo(new File("/users/leisure/desktop/" + originalFilename));
        }

        if (photos.length > 0) {
            for (MultipartFile photo : photos) {
                if (!photo.isEmpty()) {
                    photo.transferTo(new File("/users/leisure/desktop/" + photo.getOriginalFilename()));
                }
            }
        }

        return "index";
    }

}
