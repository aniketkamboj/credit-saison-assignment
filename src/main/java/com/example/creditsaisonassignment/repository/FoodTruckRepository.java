package com.example.creditsaisonassignment.repository;

import com.example.creditsaisonassignment.model.FoodTruck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface FoodTruckRepository extends JpaRepository<FoodTruck,Integer> {
    List<FoodTruck> getFoodTrucksByApplicantIs(String name);
    List<FoodTruck> getFoodTrucksByLocationDescriptionContainingIgnoreCase(String name);
    List<FoodTruck> findFoodTrucksByExpirationDateFormattedBefore(Date date);

}
