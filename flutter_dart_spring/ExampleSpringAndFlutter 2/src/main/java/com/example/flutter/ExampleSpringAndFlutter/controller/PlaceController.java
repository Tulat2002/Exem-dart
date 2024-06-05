package com.example.flutter.ExampleSpringAndFlutter.controller;

import com.example.flutter.ExampleSpringAndFlutter.entity.Place;
import com.example.flutter.ExampleSpringAndFlutter.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1/place")
@RestController
public class PlaceController {
    @Autowired
    private PlaceService placeService;




    @GetMapping
    public List<Place> getAll() {
        return placeService.getAllPlace();
    }


}