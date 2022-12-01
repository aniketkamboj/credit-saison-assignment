package controller;

import model.FoodTruck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.FoodTruckRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class FoodTruckController {
    @Autowired
    private FoodTruckRepository foodTruckRepository;

    @GetMapping("foodtrucks")
    public List<FoodTruck> getAllFoodTruck(){
        System.out.println("Inside getAllFoodTruck");
        return foodTruckRepository.findAll();
    }
}
