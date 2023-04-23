package com.example.RestaurantApplication.controllers;

import com.example.RestaurantApplication.model.Restaurant;
import com.example.RestaurantApplication.services.RestaurantServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    @Autowired
    private RestaurantServices service;

//    @GetMapping("/findRestaurant/{id}")
//    public List<Restaurant> findRestaurant(@PathVariable String id){
//        return service.findUser(id);
//    }

    @GetMapping("/findRestaurant")
    public List<Restaurant> findRestaurant(@RequestParam("id") String id){
        return service.findUser(id);
    }

    @GetMapping("/findRestaurants")
    public List<Restaurant> findRestaurants(){
        return service.findAllUser();
    }

    @PostMapping("/postData")
    public String postData(@RequestBody Restaurant data){
        return service.postData(data);
    }

    @PutMapping("/updateData/{id}")
    public String updateData(@RequestBody Restaurant data , @PathVariable String id){
        return service.updateInfo(data,id);
    }

    @DeleteMapping("/deleteId/{id}")
    public  String deleteId(@PathVariable String id){
        return service.deleteInfo(id);
    }
}
