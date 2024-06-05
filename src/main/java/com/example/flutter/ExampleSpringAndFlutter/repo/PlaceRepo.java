package com.example.flutter.ExampleSpringAndFlutter.repo;

import com.example.flutter.ExampleSpringAndFlutter.entity.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceRepo extends JpaRepository<Place, Long> {
}
