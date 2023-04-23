package com.example.RestaurantApplication.repo;

import com.example.RestaurantApplication.model.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class RestaurantDao {
    ArrayList<Restaurant> allUser = new ArrayList<>();

    public  RestaurantDao(){


        allUser.add(new Restaurant("1","SaiRestaurant","Nanded","847878203","VEG && NON_VEG","5","20"));
    }

    public List<Restaurant> findAllUser() {
        return allUser;

    }

    public boolean save(Restaurant data) {
        allUser.add(data);
        return true;
    }
}
