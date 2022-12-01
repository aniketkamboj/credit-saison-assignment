package com.example.creditsaisonassignment;

//import controller.FoodTruckController;
import com.example.creditsaisonassignment.controller.FoodTruckController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackageClasses = FoodTruckController.class)
public class CreditSaisonAssignmentApplication {
//    @Autowired
//    private FoodTruckRepository foodTruckRepository;

    public static void main(String[] args) {
        SpringApplication.run(CreditSaisonAssignmentApplication.class, args);
    }
//    @GetMapping("/api/v1/foodtrucks")
//    public List<FoodTruck> getAllFoodTruck(){
//        System.out.println("Inside getAllFoodTruck");
//        return FoodTruckController.getAllFoodTruck();
////        return foodTruckRepository.findAll();
////        return "sdaa";
//    }
//    @GetMapping("/hello")
//    public String sayHello() {
//        return String.format("Hello !");
//    }

}
