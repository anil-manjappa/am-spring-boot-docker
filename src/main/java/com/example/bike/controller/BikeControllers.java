package com.example.bike.controller;

import com.example.bike.models.Bike;
import com.example.bike.repositories.BikeRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/bikes")
public class BikeControllers {

    @Autowired
    private BikeRepositories bikeRepositories;

    @GetMapping
    public List<Bike> getBikes(){
        return bikeRepositories.findAll();
    }

    @GetMapping("/{id}")
    public Bike getBike(@PathVariable("id") long id){
        return bikeRepositories.getOne(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Bike bike){
        bikeRepositories.save(bike);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id){
        bikeRepositories.delete(bikeRepositories.getOne(id));
    }
}
