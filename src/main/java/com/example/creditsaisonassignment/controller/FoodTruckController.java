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
    /**
     * API to just test the connection .
     * It fetches the content of the whole table
     */
    @GetMapping("/testing")
    private List<FoodTruck> getAllFoodTrucks() {
        return foodTruckService.getAllFoodTruck();
    }

    /**
     * API for Q1) Search by name of applicant .
     * @param applicantName : Name of the applicant of the foodtruck
     */
    @GetMapping("/searchByName")
    public List<FoodTruck> getByApplicantName(@RequestParam("name") String applicantName){
        return foodTruckService.getFoodTruckByApplicantName(applicantName);
    }

    /**
     * API for Q2) Search by expiration date, to find whose permits have expired
     * @param date : Date against which we will check the expiry
     */
    @GetMapping("/searchByExpiry")
    public List<FoodTruck> getExpiredFoodTrucks(@RequestParam("date") @DateTimeFormat(pattern="MM/dd/yyyy") Date date){
        return foodTruckService.getFoodTrucksFromExpiry(date);
    }

    /**
     * API for Q3) Search by street name
     * @param streetName : Street name which will be used to search in the Location Descriptino column
     */
    @GetMapping("/searchByStreetName")
    public List<FoodTruck> getByStreetName(@RequestParam("streetName") String streetName){
        return foodTruckService.getFoodTruckByStreetName(streetName);
    }

    /**
     * API for Q5) Given a delivery location, find out the closest truck possible.
     * @param latitude : latitude of the given location
     * @param longitude : longitude of the given location
     */
    @GetMapping("/searchClosestTruck")
    public FoodTruck getClosestTruck(@RequestParam("latitude") String latitude ,@RequestParam("longitude") String longitude ){
        return foodTruckService.getClosestFoodTruck(latitude,longitude);
    }

    /**
     * API for Q4) Add new food truck entry to the dataset
     * @param foodTruck : FoodTruck object sent from POST request
     */
    @PostMapping("/foodTrucks")
    public FoodTruck createFoodTruck(@RequestBody FoodTruck foodTruck) {
        return foodTruckService.createFoodTruck(foodTruck);
    }
}
