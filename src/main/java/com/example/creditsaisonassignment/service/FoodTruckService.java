package com.example.creditsaisonassignment.service;

import com.example.creditsaisonassignment.model.FoodTruck;
import org.springframework.beans.factory.annotation.Autowired;
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
        System.out.println("Inside getAllFoodTruck");
        return foodTruckRepository.findAll();
    }

    public  List<FoodTruck> getFoodTruckByApplicantName(String name){
//        System.out.println("Inside getAllFoodTruck");
//        return foodTruckRepository
        return foodTruckRepository.getFoodTrucksByApplicantIs(name);
    }

    public  List<FoodTruck> getFoodTrucksFromExpiry(String date){
        List<FoodTruck> allFoodTrucks= getAllFoodTruck();
        List<FoodTruck> allset = new ArrayList<>();
        String[] givenDateArray = date.split("/");
        for(String given:givenDateArray){
            System.out.println(given);
        }

//        System.out.println(Arrays.stream(givenDateArray).toArray());
        LocalDate givenDate =  LocalDate.of(Integer.parseInt(givenDateArray[2]),
                Integer.parseInt(givenDateArray[0]),
                Integer.parseInt(givenDateArray[1]));
//        String givenDate = new Date(givenDateArray[2],givenDateArray[0]-'0',givenDateArray[1]-'0');
        System.out.println(givenDate);

//        for(FoodTruck foodTruck:allFoodTrucks){
        for(int i=1;i<allFoodTrucks.size();i++){
            FoodTruck foodTruck = allFoodTrucks.get(i);
            System.out.println(foodTruck.toString());
            String truckExpiryDateAndTime = foodTruck.getExpirationDate();
            if(truckExpiryDateAndTime==null){
                continue;
            }
            System.out.println(truckExpiryDateAndTime);
            String truckExpiryDate = truckExpiryDateAndTime.split("\\s+")[0];
            System.out.println(truckExpiryDate);
            String[] stringarray = truckExpiryDate.split("/");
            System.out.println(stringarray);
            LocalDate date1 =  LocalDate.of(Integer.parseInt(stringarray[2]),
                    Integer.parseInt(stringarray[0]),
                    Integer.parseInt(stringarray[1])
            );
            if(date1.compareTo(givenDate)<0){
                allset.add(foodTruck);
            }
        }
        return allset;
    }
//    public  List<FoodTruck> getFoodTrucksFromStreeName(String name){
////        System.out.println("Inside getAllFoodTruck");
////        return foodTruckRepository
//        return foodTruckRepository.getFoodTrucksByApplicantIs(name);
//    }

    public  List<FoodTruck> getFoodTruckByStreetName(String name){
//        System.out.println("Inside getAllFoodTruck");
//        return foodTruckRepository
        return foodTruckRepository.getFoodTrucksByLocationDescriptionContainingIgnoreCase(name);
    }
}
