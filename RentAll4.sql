Use Rental;

CREATE TABLE CUSTOMER
(
CustomerId int IDENTITY(1,1) PRIMARY KEY,
CustomerName varchar(50) NOT NULL,
Phone varchar(11) NOT NULL UNIQUE,
Password varchar(60) NOT NULL,
DrivingLicense varchar(25) NOT NULL UNIQUE,
Email varchar(50) NULL UNIQUE,
Address varchar(200) NULL,
)


CREATE TABLE VEHICLE
(
VehicleId int IDENTITY(100001,1) PRIMARY KEY,
VehicleType varchar(7) NOT NULL CHECK (VehicleType='Car' OR VehicleType='Bike' OR VehicleType='Bicycle'),
BrandName varchar(20) NOT NULL,
ModelName varchar(30) NOT NULL,
CostPerHour decimal(10,2) NOT NULL,
Color varchar(20) NULL,
)

CREATE TABLE CAR
(
CarId int IDENTITY(1,1) PRIMARY KEY,
VehicleId int NOT NULL FOREIGN KEY REFERENCES VEHICLE (VehicleId),
RegistrationNo varchar(30) NOT NULL UNIQUE,
CarType varchar(20) NULL,
CarCC int NULL,
FuelType varchar(20) NOT NULL,
CarSeat int NULL,
)

CREATE TABLE BIKE
(
BikeId int IDENTITY(1,1) PRIMARY KEY,
VehicleId int NOT NULL FOREIGN KEY REFERENCES VEHICLE (VehicleId),
RegistrationNo varchar(30) NOT NULL UNIQUE,
BikeCC int NULL,
FuelType varchar(20) NOT NULL,
)

CREATE TABLE BICYCLE
(
BicycleId int IDENTITY(1,1) PRIMARY KEY,
VehicleId int NOT NULL FOREIGN KEY REFERENCES VEHICLE (VehicleId),
BicycleType varchar(20) NULL,
WheelSize int NULL,
)

CREATE TABLE RESERVATION
(
ReservationId int IDENTITY(1,1) PRIMARY KEY,
CustomerId int NOT NULL FOREIGN KEY REFERENCES CUSTOMER (CustomerId),
VehicleId int NOT NULL FOREIGN KEY REFERENCES VEHICLE (VehicleId),
PickupPoint varchar(150) NOT NULL,
ReservationDate date NOT NULL,
StartingTime time NOT NULL,
ReservationHours int NULL DEFAULT '3' CHECK (ReservationHours >= 3),
Cost decimal(10,2) NULL,
ReservationStatus varchar(20) NOT NULL,
VehicleCount int NULL DEFAULT '1',
)

CREATE TABLE PAYMENT
(
PaymentId int IDENTITY(1,1) PRIMARY KEY,
ReservationId int NOT NULL FOREIGN KEY REFERENCES RESERVATION (ReservationId),
PaymentTime datetime NULL,
TotalAmount decimal(10,2) NOT NULL,
PaymentStatus varchar(20) NULL,
)

CREATE TABLE CANCEL
(
CancelId int IDENTITY(1,1) PRIMARY KEY,
ReservationId int NOT NULL FOREIGN KEY REFERENCES RESERVATION (ReservationId),
CancelStatus varchar(20) NOT NULL,
)

CREATE TABLE EXTRA_STORAGE
(
StorageId int IDENTITY(1,1) PRIMARY KEY,
StorageType varchar (10) NOT NULL, 
Availability varchar(10) NOT NULL CHECK (Availability='Yes' OR Availability='No'),
BrandName varchar(20) NULL,
ModelName varchar(30) NULL,
NumbreOfVehicles int NOT NULL CHECK (NumbreOfVehicles > 0),
)

CREATE TABLE FEEDBACK
(
FeedbackId int IDENTITY(1,1) PRIMARY KEY,
CustomerId int NOT NULL FOREIGN KEY REFERENCES CUSTOMER (CustomerId),
Message varchar(400) NULL,
)

INSERT INTO CUSTOMER (CustomerName, Phone, Password, DrivingLicense, Email, Address) 
VALUES ('Rahim', '01994567096', 'asm.31', 'DK0001241C00007', 'rahim@gmail.com', 'Baily Road,Dhaka'),
       ('Shima', '01794567099', 'sf@455', 'DK0001491B00008', 'shima23@gmail.com', 'Mohakhali,Dhaka'),
       ('Zabin', '01554567090', '3566!bh', 'DK0001451N00008', 'zabin675@gmail.com', 'Gulshan-1,Dhaka'),
	   ('Tusta', '01624506543', 'tusu09', 'DK0001341D00006', 'tusta03@gmail.com', 'Jatrabari,Dhaka')

INSERT INTO VEHICLE(VehicleType, BrandName, ModelName, CostPerHour, Color) 
VALUES ('Bike', 'Honda', 'XBlade', 200.00, 'Red'),
	   ('Car', 'Toyota', 'Corolla', 250.00, 'Blue'),
	   ('Bike', 'Hero', 'Splendor', 200.00, 'Black'),
       ('Bicycle', 'Adder', 'KT660', 100.00, 'Gray'),
	   ('Car', 'Ford', 'Figo', 250.00, 'White'),
       ('Car', 'Hyundai', 'Genesis', 350.00, 'Red'), 
	   ('Car', 'Hyundai', 'Tucson', 550.00, 'Blue'), 
	   ('Car', 'Tata', 'Tiago', 500.00, 'White')	

INSERT INTO CAR (VehicleId, RegistrationNo, CarType, CarCC, FuelType, CarSeat) 
VALUES (100002, 'DHAKA-GA-24-6999', 'Sedan', 1794, 'Diesel', 5),
       (100005, 'DHAKA-KHA-45-2596', 'Hatchback', 1196, 'Petrol', 5),
	   (100006, 'DHAKA-KHA-15-3546', 'Sedan', 1550, 'Petrol', 5),
	   (100007, 'DHAKA-GHA-45-2586', 'SUV', 1700, 'Diesel', 7),
	   (100008, 'DHAKA-CHA-25-5686', 'Hatchback', 1400, 'Petrol',11)

       
INSERT INTO BIKE (VehicleId, RegistrationNo, BikeCC, FuelType) 
VALUES (100001, 'DHAKA-LA-32-2911', 162, 'Petrol'),
       (100003, 'DHAKA-HA-76-3466', 97, 'Petrol')
       
INSERT INTO BICYCLE (VehicleId, BicycleType, WheelSize) 
VALUES (100004, 'Sports', 26)
       
INSERT INTO RESERVATION(CustomerId, VehicleId, PickupPoint, ReservationDate, StartingTime, ReservationHours, Cost, ReservationStatus, VehicleCount) 
VALUES (3, 100004, 'Hatirjheel', '2020-09-18', '07:15:00', 3, 300.00, 'Confirmed',1),
	   (1, 100001, 'Banani', '2020-10-18', '14:30:00', 5, 1000.00, 'Processing',1),
	   (4, 100005, 'Jatrabari', '2020-10-24', '08:00:00', 20, 5400.00, 'Confirmed',1),
	   (2, 100002, 'Gulshan-2', '2020-11-01', '19:45:00', 10, 2500.00, 'Pending',1)

INSERT INTO PAYMENT(ReservationId, PaymentTime, TotalAmount, PaymentStatus) 
VALUES (1, '2020-09-01 12:17:00', 300.00, 'Done'),
       (3, '2020-08-30 15:22:00', 5400.00, 'Pending')

INSERT INTO CANCEL(ReservationId, CancelStatus) 
VALUES (2,'Processing')

INSERT INTO EXTRA_STORAGE (StorageType, Availability, BrandName, ModelName, NumbreOfVehicles) 
VALUES ('Bike', 'Yes', 'Honda', 'XBlade', 15),
       ('Bicycle', 'No', 'Adder', 'KT660', 8),
       ('Car', 'Yes', 'Toyota', 'Corolla', 22)

INSERT INTO FEEDBACK(CustomerId, Message) 
VALUES (3,'Good service!'),
       (2,'Cancelation process is too slow.'),
       (1,'Very good.')
       
SELECT * FROM CUSTOMER
SELECT * FROM VEHICLE
SELECT * FROM CAR
SELECT * FROM BIKE
SELECT * FROM BICYCLE
SELECT * FROM RESERVATION
SELECT * FROM PAYMENT
SELECT * FROM CANCEL
SELECT * FROM EXTRA_STORAGE
SELECT * FROM FEEDBACK





SELECT * FROM CAR LEFT JOIN VEHICLE ON CAR.VehicleId = VEHICLE.VehicleId

select * FROM CAR where NOT EXISTS (select * from car left join reservation ON CAR.VehicleId = RESERVATION.VehicleId)

SELECT * FROM CAR where CarCC != 1794

SELECT VehicleId FROM CAR where VehicleId != all (select VehicleId from RESERVATION)

/*SELECT VehicleId FROM CAR where modelId = 1100*/

ALTER TABLE PAYMENT
DROP COLUMN PaymentTime;

 --where r.VehicleId = c.VehicleId


SELECT CAR.VehicleId, BrandName, ModelName, Color, CarCC, FuelType, CostPerHour FROM CAR JOIN VEHICLE ON CAR.VehicleId = VEHICLE.VehicleId and ModelName='XBlade'
/*VehicleId, BrandName, ModelName, Color, CarCC,FuelType */
/*BrandName + ' ' + ModelName as ' Name' FROM CUSTOMER*/

INSERT INTO FEEDBACK (CustomerId, Message)
VALUES ((Select CustomerId from CUSTOMER where Phone='01994567096'),'fxhtrxf')







