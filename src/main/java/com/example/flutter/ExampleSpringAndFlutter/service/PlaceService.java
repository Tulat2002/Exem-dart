package com.example.flutter.ExampleSpringAndFlutter.service;

import com.example.flutter.ExampleSpringAndFlutter.entity.Place;
import com.example.flutter.ExampleSpringAndFlutter.repo.PlaceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Configuration
public class PlaceService {

    @Autowired
    PlaceRepo placeRepo;

    public List<Place> getAllPlace(){
        return placeRepo.findAll();
    }

}
