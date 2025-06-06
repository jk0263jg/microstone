package com.example.clothesbox.controller;

import com.example.clothesbox.service.PublicDataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/box")
public class BoxController {

    private final PublicDataService publicDataService;

    public BoxController(PublicDataService publicDataService) {
        this.publicDataService = publicDataService;
    }

    @GetMapping("/markers")
    public List<Map<String, String>> getMarkers() {
        return publicDataService.getClothesBoxInfo();
    }
}
