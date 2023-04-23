package com.example.RestaurantApplication.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Restaurant {
    private  String restaurantId ;
    private String restaurantName;
    private String restaurantAddress;
    private  String restaurantNumber;
    private String restaurantSpecialty;
    private  String  restaurantRatings ;
    private  String restaurantTotalStaffs;



}
