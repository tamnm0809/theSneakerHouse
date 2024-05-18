package com.sneakerHouse.services.impl;

import com.cloudinary.Cloudinary;
import com.cloudinary.api.ApiResponse;
import com.cloudinary.utils.ObjectUtils;
import com.sneakerHouse.services.CloudinaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CloudinaryServiceImpl implements CloudinaryService {

    @Autowired
    public Cloudinary cloudinary;

    public List<Map> getAllImages() throws Exception {
        ApiResponse response = cloudinary.api().resources(ObjectUtils.emptyMap());
        return (List<Map>) response.get("resources");
    }

    public String getImageUrl(String publicId) {
        return cloudinary.url().secure(true).generate(publicId);
    }
}
