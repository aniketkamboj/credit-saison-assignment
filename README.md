# credit-saison-assignment

Assignment doc -> https://docs.google.com/document/d/1QmVoknUAopo1pc1AeRUmOxJIru2BJeqI/edit

Data csv used -> https://drive.google.com/file/d/1JTygKo7Utcp-CP0EZhT2cK_-swmvhIvH/view?usp=sharing

PostgreSQL commands for creating the table-> 

```
CREATE TABLE foodtruck5(
locationid INT,
Applicant   VARCHAR(100),
FacilityType VARCHAR(50),
cnn INT,
LocationDescription VARCHAR(1000),
Address VARCHAR(100),
blocklot VARCHAR(20),
block VARCHAR(10),
lot VARCHAR(10),
permit VARCHAR(20),
Status VARCHAR(10),
FoodItems VARCHAR(2000),
X_Val float8,
Y_Val float8,
Latitude float8,
Longitude float8,
Schedule VARCHAR(200),
dayshours VARCHAR(100),
NOISent VARCHAR(100),
Approved VARCHAR(100),
Received Date,
PriorPermit INT,
ExpirationDate VARCHAR(200),
ExpiryDateFormatted Date,
Fire_Prevention_Districts INT,
Police_Districts INT,
Supervisor_Districts INT,
Neighborhoods_old INT,

PRIMARY KEY(locationid)
);
```

PostgreSQL command for importing CSV data -> 
```
\copy public.foodtruck5 (locationid, applicant, facilitytype, cnn, locationdescription, address, blocklot, block, lot, permit, status, 
fooditems, x_val, y_val, latitude, longitude, schedule, dayshours, noisent, approved, received, priorpermit, expirationdate, 
expirydateformatted, fire_prevention_districts, police_districts, supervisor_districts, neighborhoods_old) 
FROM '/Users/aniketkamboj/Documents/targetCSV.csv' DELIMITER ',' CSV HEADER ;
```

