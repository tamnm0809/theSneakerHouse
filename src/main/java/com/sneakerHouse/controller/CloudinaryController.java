package com.sneakerHouse.controller;

import com.sneakerHouse.services.CloudinaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/cloud-image")
public class CloudinaryController {

    @Autowired
    public CloudinaryService cloudinaryService;

    @GetMapping("/getAllImage")
    public ResponseEntity<?> getAllImages() {
        try {
            List<Map> images = cloudinaryService.getAllImages();
            return ResponseEntity.ok(images);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error get images on cloud: " + e.getMessage());
        }
    }

    @GetMapping("/{publicId}")
    public ResponseEntity<?> getImageUrl(@PathVariable String publicId) {
        try {
            String url = cloudinaryService.getImageUrl(publicId);
            return ResponseEntity.ok(url);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error retrieving image URL: " + e.getMessage());
        }
    }
}
