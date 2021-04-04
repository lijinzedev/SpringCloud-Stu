package com.stu.app.controller;

import com.stu.app.entities.Payment;
import com.stu.app.fegin.TestFeign;
import com.stu.app.fegin.TestFeign2;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.annotation.Resource;
import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;

/**
 * @author: Curiosity
 * @Date: 2021/1/23 17:46
 * @Description:
 */
@RestController
@RequestMapping("/test")
public class FeginController {
    @Resource
    public TestFeign feign;
    @Resource

    public TestFeign2 feign2;

    @GetMapping("/")
    public String testFeign() {
        System.out.println("调用");
        return feign.providerFeign(new Payment(1L, "123"));
    }
    @GetMapping("/2")
    public String testFeign2() {
        System.out.println("调用");
        return feign2.providerFeign(new Payment(1L, "123"));
    }
    @PostMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile[] multipartFile) throws IOException {
        return feign2.upload(Arrays.asList(multipartFile));
//        return addFileInAnotherEndPoint(multipartFile);
    }
    public String addFileInAnotherEndPoint( MultipartFile[] file) throws IOException {
        MultiValueMap<String, Object> multiValueMap = new LinkedMultiValueMap<>();
        for (MultipartFile multipartFile : file) {
            ByteArrayResource contentsAsResource = new ByteArrayResource(multipartFile.getBytes()) {
                @Override
                public String getFilename() {
                    return multipartFile.getOriginalFilename();
                }
            };
            multiValueMap.add("file", contentsAsResource);
        }
        return this.feign2.addFile( multiValueMap);
    }


    public static MultipartFile file2MultipartFile(File file) throws IOException {
        FileItem fileItem = new DiskFileItemFactory().createItem("file",
                Files.probeContentType(file.toPath()), false, file.getName());

        try (InputStream in = new FileInputStream(file); OutputStream out = fileItem.getOutputStream()) {
            StreamUtils.copy(in,out);
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid file: " + e, e);
        }

        return new CommonsMultipartFile(fileItem);
    }
}
