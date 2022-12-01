package com.example.creditsaisonassignment.controller;

import com.example.creditsaisonassignment.model.FoodTruck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.creditsaisonassignment.service.FoodTruckService;

import java.util.List;

@RestController
public class FoodTruckController {

    @Autowired
    FoodTruckService foodTruckService;
    @GetMapping("/testing")
    private List<FoodTruck> getAllBooks()
    {
        return foodTruckService.getAllFoodTruck();
    }

    @GetMapping("/searchByName")
    public List<FoodTruck> getByApplicantName(@RequestParam("name") String applicantName){
        return foodTruckService.getFoodTruckByApplicantName(applicantName);
    }

    @GetMapping("/searchByExpiry")
    public List<FoodTruck> getExpiredFoodTrucks(@RequestParam("date") String date){
        return foodTruckService.getFoodTrucksFromExpiry(date);
    }

    @GetMapping("/searchByStreetName")
    public List<FoodTruck> getByStreetName(@RequestParam("date") String date){
        return foodTruckService.getFoodTruckByStreetName(date);
    }
}
