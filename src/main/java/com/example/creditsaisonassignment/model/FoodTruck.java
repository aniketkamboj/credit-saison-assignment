package com.example.creditsaisonassignment.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "foodtruck5")
public class FoodTruck {
    @Id
    @Column(name = "locationid")
    private Integer locationId;
    @Column(name="applicant")
    private String applicant;
    @Column(name="facilitytype")
    private String facilityType;
    @Column(name = "cnn")
    private Integer cnn;
    @Column(name = "locationdescription")
    private String locationDescription;
    @Column(name = "address")
    private String Address;
    @Column(name = "blocklot")
    private String blocklot;
    @Column(name="block")
    private String block;
    @Column(name="lot")
    private String lot;
    @Column(name = "permit")
    private String permit;
    @Column(name = "status")
    private String status;
    @Column(name = "fooditems")
    private String foodItems;
    @Column(name = "x_val")
    private Double xVal;
    @Column(name = "y_val")
    private Double yVal;
    @Column(name = "latitude")
    private Double latitude;
    @Column(name = "longitude")
    private Double longitude;
    @Column(name = "schedule")
    private String schedule;
    @Column(name = "dayshours")
    private String daysHours;
    @Column(name = "noisent")
    private String noiSent;
    @Column(name = "approved")
    private String approved;
    @Column(name = "received")
    private Date received;
    @Column(name = "priorpermit")
    private Integer priorPermit;
    @Column(name = "expirationdate")
    private String expirationDate;
    @Column(name = "expirydateformatted")
    private Date expirationDateFormatted;
    @Column(name = "fire_prevention_districts")
    private Integer fire_prevention_districts;
    @Column(name = "police_districts")
    private Integer police_districts;
    @Column(name = "supervisor_districts")
    private Integer supervisor_districts;
    @Column(name = "neighborhoods_old")
    private Integer neighborhoods_old;

    public FoodTruck(Integer locationId, String applicant, String facilityType, Integer cnn, String locationDescription, String address, String blocklot, String block, String lot, String permit, String status, String foodItems, Double xVal, Double yVal, Double latitude, Double longitude, String schedule, String daysHours, String noiSent, String approved, Date received, Integer priorPermit, String expirationDate, Date expirationDateFormatted, Integer fire_prevention_districts, Integer police_districts, Integer supervisor_districts, Integer neighborhoods_old) {
        this.locationId = locationId;
        this.applicant = applicant;
        this.facilityType = facilityType;
        this.cnn = cnn;
        this.locationDescription = locationDescription;
        Address = address;
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
        this.expirationDateFormatted = expirationDateFormatted;
        this.fire_prevention_districts = fire_prevention_districts;
        this.police_districts = police_districts;
        this.supervisor_districts = supervisor_districts;
        this.neighborhoods_old = neighborhoods_old;
    }

    public FoodTruck() {
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
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

    public Integer getCnn() {
        return cnn;
    }

    public void setCnn(Integer cnn) {
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
        Address = address;
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

    public Double getxVal() {
        return xVal;
    }

    public void setxVal(Double xVal) {
        this.xVal = xVal;
    }

    public Double getyVal() {
        return yVal;
    }

    public void setyVal(Double yVal) {
        this.yVal = yVal;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
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

    public Date getReceived() {
        return received;
    }

    public void setReceived(Date received) {
        this.received = received;
    }

    public Integer getPriorPermit() {
        return priorPermit;
    }

    public void setPriorPermit(Integer priorPermit) {
        this.priorPermit = priorPermit;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Date getExpirationDateFormatted() {
        return expirationDateFormatted;
    }

    public void setExpirationDateFormatted(Date expirationDateFormatted) {
        this.expirationDateFormatted = expirationDateFormatted;
    }

    public Integer getFire_prevention_districts() {
        return fire_prevention_districts;
    }

    public void setFire_prevention_districts(Integer fire_prevention_districts) {
        this.fire_prevention_districts = fire_prevention_districts;
    }

    public Integer getPolice_districts() {
        return police_districts;
    }

    public void setPolice_districts(Integer police_districts) {
        this.police_districts = police_districts;
    }

    public Integer getSupervisor_districts() {
        return supervisor_districts;
    }

    public void setSupervisor_districts(Integer supervisor_districts) {
        this.supervisor_districts = supervisor_districts;
    }

    public Integer getNeighborhoods_old() {
        return neighborhoods_old;
    }

    public void setNeighborhoods_old(Integer neighborhoods_old) {
        this.neighborhoods_old = neighborhoods_old;
    }
}
