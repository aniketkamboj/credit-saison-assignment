package com.example.creditsaisonassignment.repository;

import com.example.creditsaisonassignment.model.FoodTruck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodTruckRepository extends JpaRepository<FoodTruck,String> {
//    @Query(value = "SELECT * FROM foodtrucks WHERE Applicant == ?1", nativeQuery=true)
    List<FoodTruck> getFoodTrucksByApplicantIs(String name);
    List<FoodTruck> getFoodTrucksByLocationDescriptionContainingIgnoreCase(String name);

}
