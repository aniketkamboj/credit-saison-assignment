package com.example.creditsaisonassignment.model;

import jakarta.persistence.*;

@Entity
@Table(name = "foodtruck")
public class FoodTruck {
    @Id
    @Column(name = "locationid")
    private String locationId;
    @Column(name="Applicant")
    private String applicant;
    @Column(name="FacilityType")
    private String facilityType;
    @Column(name = "cnn")
    private String cnn;
    @Column(name = "LocationDescription")
    private String locationDescription;
    @Column(name = "Address")
    private String Address;
    @Column(name = "blocklot")
    private String blocklot;
    @Column(name="block")
    private String block;
    @Column(name="lot")
    private String lot;
    @Column(name = "permit")
    private String permit;
    @Column(name = "Status")
    private String status;
    @Column(name = "FoodItems")
    private String foodItems;
    @Column(name = "X_Val")
    private String xVal;
    @Column(name = "Y_Val")
    private String yVal;
    @Column(name = "Latitude")
    private String latitude;
    @Column(name = "Longitude")
    private String longitude;
    @Column(name = "Schedule")
    private String schedule;
    @Column(name = "dayshours")
    private String daysHours;
    @Column(name = "NOISent")
    private String noiSent;
    @Column(name = "Approved")
    private String approved;
    @Column(name = "Received")
    private String received;
    @Column(name = "PriorPermit")
    private String priorPermit;
    @Column(name = "ExpirationDate")
    private String expirationDate;
    @Column(name = "Location")
    private String location;

    public FoodTruck(String locationId, String applicant, String facilityType, String cnn, String locationDescription, String address, String blocklot, String block, String lot, String permit, String status, String foodItems, String xVal, String yVal, String latitude, String longitude, String schedule, String daysHours, String noiSent, String approved, String received, String priorPermit, String expirationDate, String location) {
        this.locationId = locationId;
        this.applicant = applicant;
        this.facilityType = facilityType;
        this.cnn = cnn;
        this.locationDescription = locationDescription;
        this.Address = address;
        this.blocklot = blocklot;
        this.block = block;
        this.lot = lot;
        this.permit = permit;
        this.status = status;
        this.foodItems = foodItems;
        this.xVal = xVal;
        this.yVal = yVal;
        this.latitude = latitude;
        this.longitude = longitude;
        this.schedule = schedule;
        this.daysHours = daysHours;
        this.noiSent = noiSent;
        this.approved = approved;
        this.received = received;
        this.priorPermit = priorPermit;
        this.expirationDate = expirationDate;
        this.location = location;
    }

    public FoodTruck() {
    }


    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public String getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(String facilityType) {
        this.facilityType = facilityType;
    }


    public String getCnn() {
        return cnn;
    }

    public void setCnn(String cnn) {
        this.cnn = cnn;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public String getBlocklot() {
        return blocklot;
    }

    public void setBlocklot(String blocklot) {
        this.blocklot = blocklot;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getLot() {
        return lot;
    }

    public void setLot(String lot) {
        this.lot = lot;
    }

    public String getPermit() {
        return permit;
    }

    public void setPermit(String permit) {
        this.permit = permit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(String foodItems) {
        this.foodItems = foodItems;
    }

    public String getxVal() {
        return xVal;
    }

    public void setxVal(String xVal) {
        this.xVal = xVal;
    }

    public String getyVal() {
        return yVal;
    }

    public void setyVal(String yVal) {
        this.yVal = yVal;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getDaysHours() {
        return daysHours;
    }

    public void setDaysHours(String daysHours) {
        this.daysHours = daysHours;
    }

    public String getNoiSent() {
        return noiSent;
    }

    public void setNoiSent(String noiSent) {
        this.noiSent = noiSent;
    }

    public String getApproved() {
        return approved;
    }

    public void setApproved(String approved) {
        this.approved = approved;
    }

    public String getReceived() {
        return received;
    }

    public void setReceived(String received) {
        this.received = received;
    }

    public String getPriorPermit() {
        return priorPermit;
    }

    public void setPriorPermit(String priorPermit) {
        this.priorPermit = priorPermit;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
