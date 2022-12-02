package com.example.creditsaisonassignment.controller;

import com.example.creditsaisonassignment.model.FoodTruck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import com.example.creditsaisonassignment.service.FoodTruckService;

import java.util.Date;
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
    public List<FoodTruck> getExpiredFoodTrucks(@RequestParam("date") @DateTimeFormat(pattern="MM/dd/yyyy") Date date){
        return foodTruckService.getFoodTrucksFromExpiry(date);
    }

    @GetMapping("/searchByStreetName")
    public List<FoodTruck> getByStreetName(@RequestParam("streetName") String streetName){
        return foodTruckService.getFoodTruckByStreetName(streetName);
    }

    @GetMapping("/searchClosestTruck")
    public FoodTruck getClosestTruck(@RequestParam("latitude") String latitude ,@RequestParam("longitude") String longitude ){
        return foodTruckService.getClosestFoodTruck(latitude,longitude);
    }

    @RequestMapping(value = "/foodTrucks" , method = RequestMethod.POST , consumes = "application/json")
    public FoodTruck createFoodTruck(@RequestBody FoodTruck foodTruck) {
        return foodTruckService.createFoodTruck(foodTruck);
    }
}
