package com.example.creditsaisonassignment.service;

import com.example.creditsaisonassignment.model.FoodTruck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.parsing.Location;
import org.springframework.stereotype.Service;
import com.example.creditsaisonassignment.repository.FoodTruckRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.*;

@Service
public class FoodTruckService {
    @Autowired
    FoodTruckRepository foodTruckRepository;

    public  List<FoodTruck> getAllFoodTruck(){
        return foodTruckRepository.findAll();
    }

    public  List<FoodTruck> getFoodTruckByApplicantName(String name){
        return foodTruckRepository.getFoodTrucksByApplicantIs(name);
    }

    public  List<FoodTruck> getFoodTrucksFromExpiry(Date date){
        return foodTruckRepository.findFoodTrucksByExpirationDateFormattedBefore(date);
    }

    public  List<FoodTruck> getFoodTruckByStreetName(String name){
        return foodTruckRepository.getFoodTrucksByLocationDescriptionContainingIgnoreCase(name);
    }

    public FoodTruck createFoodTruck(FoodTruck foodTruck){
        return foodTruckRepository.save(foodTruck);
    }


    /**
     * Method taken from https://www.geodatasource.com/resources/tutorials/how-to-calculate-the-distance-between-2-locations-using-java/
     */
    private  double distance(double lat1, double lon1, double lat2, double lon2) {
        if ((lat1 == lat2) && (lon1 == lon2)) {
            return 0;
        }
        else {
            double theta = lon1 - lon2;
            double dist = Math.sin(Math.toRadians(lat1)) * Math.sin(Math.toRadians(lat2)) + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.cos(Math.toRadians(theta));
            dist = Math.acos(dist);
            dist = Math.toDegrees(dist);
            dist = dist * 60 * 1.1515;
            dist = dist * 1.609344;
            return (dist);
        }
    }

    public FoodTruck getClosestFoodTruck(String latitude , String longitude){
        List<FoodTruck> allFoodTrucks= getAllFoodTruck();
        Double dist = Double.MAX_VALUE;
        FoodTruck foodTruck = null;
        for(int i=1;i<allFoodTrucks.size();i++){
            Double dist2 = distance(Double.parseDouble(latitude),
                            Double.parseDouble(longitude),
                            allFoodTrucks.get(i).getLatitude(),
                            allFoodTrucks.get(i).getLongitude()
                            );
            if(dist2<dist){
                foodTruck = allFoodTrucks.get(i);
                dist = dist2;
            }
        }
        return foodTruck;
    }
}
