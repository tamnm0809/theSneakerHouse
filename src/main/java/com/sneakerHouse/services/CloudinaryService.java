package com.sneakerHouse.services;

import java.util.List;
import java.util.Map;

public interface CloudinaryService {

    public List<Map> getAllImages() throws Exception;

    public String getImageUrl(String publicId);
}
