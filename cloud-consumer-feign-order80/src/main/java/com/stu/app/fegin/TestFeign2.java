package com.stu.app.fegin;

import com.stu.app.entities.Payment;
import feign.Request;
import feign.codec.Encoder;
import feign.form.FormEncoder;
import feign.form.spring.SpringFormEncoder;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.support.SpringEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author: Curiosity
 * @Date: 2021/1/23 17:46
 * @Description:
 */
@FeignClient(name = "nacos-config-client", path = "/feign", configuration = {TestFeign2.CoreFeignConfiguration.class})
public interface TestFeign2 {
    @PostMapping("/get")
    public String providerFeign(@RequestBody Payment payment);

    @PostMapping(value = "/upload",consumes = MediaType.MULTIPART_FORM_DATA_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    String upload(@RequestPart List<MultipartFile> multipartFile);
    @PostMapping(value = "/upload",consumes = MediaType.MULTIPART_FORM_DATA_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    String addFile(@RequestPart("file") MultiValueMap<String, Object> file);

    public static class CoreFeignConfiguration {
        @Bean
        public Request.Options options() {
            return new Request.Options(6 * 1000, 6 * 1000);
        }
        @Autowired
        private ObjectFactory<HttpMessageConverters> messageConverters;

        @Bean
        public Encoder multipartFormEncoder() {
            return new SpringFormEncoder(new SpringEncoder(messageConverters));
        }

        @Bean
        public feign.Logger.Level multipartLoggerLevel() {
            return feign.Logger.Level.FULL;
        }
    }
}
