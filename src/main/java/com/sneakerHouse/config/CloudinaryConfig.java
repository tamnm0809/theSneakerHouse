package com.sneakerHouse.config;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CloudinaryConfig {

    @Bean
    public Cloudinary cloudinary() {
        return new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "dchefcs07",
                "api_key", "366994417113435",
                "api_secret", "pFv06ognVfXk6BM-NgTkjHkZZ8o",
                "folder","theSneakerHouse",
                "resource_type", "image"
        ));
    }
}
