package com.example.RestaurantApplication.services;

import com.example.RestaurantApplication.model.Restaurant;
import com.example.RestaurantApplication.repo.RestaurantDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class RestaurantServices {
    @Autowired
    private RestaurantDao repo;
    public List<Restaurant> findAllUser() {
        return repo.findAllUser();
    }

    public List<Restaurant> findUser(String id) {
        List<Restaurant> user = new ArrayList<>();

        List<Restaurant> allUser = repo.findAllUser();

        for(Restaurant data : allUser){
            if (data.getRestaurantId().equals(id)){
                user.add(data);

            }
        }
        return user;
    }


    public String postData(Restaurant data) {
        boolean insertion = repo.save(data);

        if(insertion == true){
            return "Addes Successfully";
        }else{
            return "Not Added";
        }
    }

    public String updateInfo(Restaurant data, String id) {
        if(id != null){
            List<Restaurant> allUser = repo.findAllUser();
            for(Restaurant val : allUser){
                if(val.getRestaurantId().equals(id)){
                    val.setRestaurantNumber(data.getRestaurantNumber());
                    val.setRestaurantSpecialty(data.getRestaurantSpecialty());
                    val.setRestaurantAddress(data.getRestaurantAddress());
                    val.setRestaurantTotalStaffs(data.getRestaurantTotalStaffs());
                    val.setRestaurantName(data.getRestaurantName());
                    val.setRestaurantId(data.getRestaurantId());
                    val.setRestaurantRatings(data.getRestaurantRatings());
                    return "Successfully Updated";
                }
            }

        }else {
            return "Not Found ID.....!!!!";
        }
        return  "Enter a Id";
    }

    public String deleteInfo(String id) {

        List<Restaurant> allUser = repo.findAllUser();

        for (Restaurant val : allUser) {
            if (val.getRestaurantId().equals(id)) {
                allUser.remove(val);
                return "Successfully Deleted Id";
            }

        }
        return "Not Found Id";
    }
}
