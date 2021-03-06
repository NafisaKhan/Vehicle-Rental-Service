USE [master]
GO
/****** Object:  Database [Rental]    Script Date: 24-Sep-20 6:01:38 PM ******/
CREATE DATABASE [Rental]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'Rental', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.SQLEXPRESS\MSSQL\DATA\Rental.mdf' , SIZE = 3072KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'Rental_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.SQLEXPRESS\MSSQL\DATA\Rental_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [Rental] SET COMPATIBILITY_LEVEL = 120
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [Rental].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [Rental] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [Rental] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [Rental] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [Rental] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [Rental] SET ARITHABORT OFF 
GO
ALTER DATABASE [Rental] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [Rental] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [Rental] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [Rental] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [Rental] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [Rental] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [Rental] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [Rental] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [Rental] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [Rental] SET  DISABLE_BROKER 
GO
ALTER DATABASE [Rental] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [Rental] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [Rental] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [Rental] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [Rental] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [Rental] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [Rental] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [Rental] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [Rental] SET  MULTI_USER 
GO
ALTER DATABASE [Rental] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [Rental] SET DB_CHAINING OFF 
GO
ALTER DATABASE [Rental] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [Rental] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [Rental] SET DELAYED_DURABILITY = DISABLED 
GO
USE [Rental]
GO
/****** Object:  Table [dbo].[BICYCLE]    Script Date: 24-Sep-20 6:01:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[BICYCLE](
	[BicycleId] [int] IDENTITY(1,1) NOT NULL,
	[VehicleId] [int] NOT NULL,
	[BicycleType] [varchar](20) NULL,
	[WheelSize] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[BicycleId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[BIKE]    Script Date: 24-Sep-20 6:01:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[BIKE](
	[BikeId] [int] IDENTITY(1,1) NOT NULL,
	[VehicleId] [int] NOT NULL,
	[RegistrationNo] [varchar](30) NOT NULL,
	[BikeCC] [int] NULL,
	[FuelType] [varchar](20) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[BikeId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[CANCEL]    Script Date: 24-Sep-20 6:01:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[CANCEL](
	[CancelId] [int] IDENTITY(1,1) NOT NULL,
	[ReservationId] [int] NOT NULL,
	[CancelStatus] [varchar](20) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[CancelId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[CAR]    Script Date: 24-Sep-20 6:01:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[CAR](
	[CarId] [int] IDENTITY(1,1) NOT NULL,
	[VehicleId] [int] NOT NULL,
	[RegistrationNo] [varchar](30) NOT NULL,
	[CarType] [varchar](20) NULL,
	[CarCC] [int] NULL,
	[FuelType] [varchar](20) NOT NULL,
	[CarSeat] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[CarId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[CUSTOMER]    Script Date: 24-Sep-20 6:01:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[CUSTOMER](
	[CustomerId] [int] IDENTITY(1,1) NOT NULL,
	[CustomerName] [varchar](50) NOT NULL,
	[Phone] [varchar](11) NOT NULL,
	[Password] [varchar](60) NOT NULL,
	[DrivingLicense] [varchar](25) NOT NULL,
	[Email] [varchar](50) NULL,
	[Address] [varchar](200) NULL,
PRIMARY KEY CLUSTERED 
(
	[CustomerId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[EXTRA_STORAGE]    Script Date: 24-Sep-20 6:01:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[EXTRA_STORAGE](
	[StorageId] [int] IDENTITY(1,1) NOT NULL,
	[StorageType] [varchar](10) NOT NULL,
	[Availability] [varchar](10) NOT NULL,
	[BrandName] [varchar](20) NULL,
	[ModelName] [varchar](30) NULL,
	[NumbreOfVehicles] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[StorageId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[FEEDBACK]    Script Date: 24-Sep-20 6:01:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[FEEDBACK](
	[FeedbackId] [int] IDENTITY(1,1) NOT NULL,
	[CustomerId] [int] NOT NULL,
	[Message] [varchar](400) NULL,
PRIMARY KEY CLUSTERED 
(
	[FeedbackId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[PAYMENT]    Script Date: 24-Sep-20 6:01:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[PAYMENT](
	[PaymentId] [int] IDENTITY(1,1) NOT NULL,
	[ReservationId] [int] NOT NULL,
	[PaymentTime] [datetime] NULL,
	[TotalAmount] [decimal](10, 2) NOT NULL,
	[PaymentStatus] [varchar](20) NULL,
PRIMARY KEY CLUSTERED 
(
	[PaymentId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[RESERVATION]    Script Date: 24-Sep-20 6:01:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[RESERVATION](
	[ReservationId] [int] IDENTITY(1,1) NOT NULL,
	[CustomerId] [int] NOT NULL,
	[VehicleId] [int] NOT NULL,
	[PickupPoint] [varchar](150) NOT NULL,
	[ReservationDate] [date] NOT NULL,
	[StartingTime] [time](7) NOT NULL,
	[ReservationHours] [int] NULL DEFAULT ('3'),
	[Cost] [decimal](10, 2) NULL,
	[ReservationStatus] [varchar](20) NOT NULL,
	[VehicleCount] [int] NULL DEFAULT ('1'),
PRIMARY KEY CLUSTERED 
(
	[ReservationId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[VEHICLE]    Script Date: 24-Sep-20 6:01:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[VEHICLE](
	[VehicleId] [int] IDENTITY(100001,1) NOT NULL,
	[VehicleType] [varchar](7) NOT NULL,
	[BrandName] [varchar](20) NOT NULL,
	[ModelName] [varchar](30) NOT NULL,
	[CostPerHour] [decimal](10, 2) NOT NULL,
	[Color] [varchar](20) NULL,
PRIMARY KEY CLUSTERED 
(
	[VehicleId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[BICYCLE] ON 

INSERT [dbo].[BICYCLE] ([BicycleId], [VehicleId], [BicycleType], [WheelSize]) VALUES (1, 100004, N'Sports', 26)
SET IDENTITY_INSERT [dbo].[BICYCLE] OFF
SET IDENTITY_INSERT [dbo].[BIKE] ON 

INSERT [dbo].[BIKE] ([BikeId], [VehicleId], [RegistrationNo], [BikeCC], [FuelType]) VALUES (1, 100001, N'DHAKA-LA-32-2911', 162, N'Petrol')
INSERT [dbo].[BIKE] ([BikeId], [VehicleId], [RegistrationNo], [BikeCC], [FuelType]) VALUES (2, 100003, N'DHAKA-HA-76-3466', 97, N'Petrol')
SET IDENTITY_INSERT [dbo].[BIKE] OFF
SET IDENTITY_INSERT [dbo].[CANCEL] ON 

INSERT [dbo].[CANCEL] ([CancelId], [ReservationId], [CancelStatus]) VALUES (1, 2, N'Processing')
SET IDENTITY_INSERT [dbo].[CANCEL] OFF
SET IDENTITY_INSERT [dbo].[CAR] ON 

INSERT [dbo].[CAR] ([CarId], [VehicleId], [RegistrationNo], [CarType], [CarCC], [FuelType], [CarSeat]) VALUES (1, 100002, N'DHAKA-GA-24-9999', N'Sedan', 1794, N'Diesel', 5)
INSERT [dbo].[CAR] ([CarId], [VehicleId], [RegistrationNo], [CarType], [CarCC], [FuelType], [CarSeat]) VALUES (2, 100005, N'DHAKA-KHA-45-2586', N'Hatchback', 1196, N'Petrol', 5)
INSERT [dbo].[CAR] ([CarId], [VehicleId], [RegistrationNo], [CarType], [CarCC], [FuelType], [CarSeat]) VALUES (6, 100002, N'DHAKA-GA-24-6999', N'Sedan', 1794, N'Diesel', 5)
INSERT [dbo].[CAR] ([CarId], [VehicleId], [RegistrationNo], [CarType], [CarCC], [FuelType], [CarSeat]) VALUES (7, 100005, N'DHAKA-KHA-45-2596', N'Hatchback', 1196, N'Petrol', 5)
INSERT [dbo].[CAR] ([CarId], [VehicleId], [RegistrationNo], [CarType], [CarCC], [FuelType], [CarSeat]) VALUES (8, 100006, N'DHAKA-KHA-15-3546', N'Sedan', 1550, N'Petrol', 5)
INSERT [dbo].[CAR] ([CarId], [VehicleId], [RegistrationNo], [CarType], [CarCC], [FuelType], [CarSeat]) VALUES (9, 100007, N'DHAKA-GHA-45-2586', N'SUV', 1700, N'Diesel', 7)
INSERT [dbo].[CAR] ([CarId], [VehicleId], [RegistrationNo], [CarType], [CarCC], [FuelType], [CarSeat]) VALUES (10, 100008, N'DHAKA-CHA-25-5686', N'Hatchback', 1400, N'Petrol', 11)
SET IDENTITY_INSERT [dbo].[CAR] OFF
SET IDENTITY_INSERT [dbo].[CUSTOMER] ON 

INSERT [dbo].[CUSTOMER] ([CustomerId], [CustomerName], [Phone], [Password], [DrivingLicense], [Email], [Address]) VALUES (1, N'Rahim', N'01994567096', N'asm.31', N'DK0001241C00007', N'rahim@gmail.com', N'Baily Road,Dhaka')
INSERT [dbo].[CUSTOMER] ([CustomerId], [CustomerName], [Phone], [Password], [DrivingLicense], [Email], [Address]) VALUES (2, N'Shima', N'01794567099', N'sf@455', N'DK0001491B00008', N'shima23@gmail.com', N'Mohakhali,Dhaka')
INSERT [dbo].[CUSTOMER] ([CustomerId], [CustomerName], [Phone], [Password], [DrivingLicense], [Email], [Address]) VALUES (3, N'Zabin', N'01554567090', N'3566!bh', N'DK0001451N00008', N'zabin675@gmail.com', N'Gulshan-1,Dhaka')
INSERT [dbo].[CUSTOMER] ([CustomerId], [CustomerName], [Phone], [Password], [DrivingLicense], [Email], [Address]) VALUES (4, N'Tusta', N'01624506543', N'tusu09', N'DK0001341D00006', N'tusta03@gmail.com', N'Jatrabari,Dhaka')
INSERT [dbo].[CUSTOMER] ([CustomerId], [CustomerName], [Phone], [Password], [DrivingLicense], [Email], [Address]) VALUES (5, N'Euna', N'01945678912', N'123456', N'DK1234567890123', N'euna@gmail.com', N'Tejgaon,Dhaka')
SET IDENTITY_INSERT [dbo].[CUSTOMER] OFF
SET IDENTITY_INSERT [dbo].[EXTRA_STORAGE] ON 

INSERT [dbo].[EXTRA_STORAGE] ([StorageId], [StorageType], [Availability], [BrandName], [ModelName], [NumbreOfVehicles]) VALUES (1, N'Bike', N'Yes', N'Honda', N'XBlade', 15)
INSERT [dbo].[EXTRA_STORAGE] ([StorageId], [StorageType], [Availability], [BrandName], [ModelName], [NumbreOfVehicles]) VALUES (2, N'Bicycle', N'No', N'Adder', N'KT660', 8)
INSERT [dbo].[EXTRA_STORAGE] ([StorageId], [StorageType], [Availability], [BrandName], [ModelName], [NumbreOfVehicles]) VALUES (3, N'Car', N'Yes', N'Toyota', N'Corolla', 22)
SET IDENTITY_INSERT [dbo].[EXTRA_STORAGE] OFF
SET IDENTITY_INSERT [dbo].[FEEDBACK] ON 

INSERT [dbo].[FEEDBACK] ([FeedbackId], [CustomerId], [Message]) VALUES (1, 3, N'Good service!')
INSERT [dbo].[FEEDBACK] ([FeedbackId], [CustomerId], [Message]) VALUES (2, 2, N'Cancelation process is too slow.')
INSERT [dbo].[FEEDBACK] ([FeedbackId], [CustomerId], [Message]) VALUES (3, 1, N'Very good.')
INSERT [dbo].[FEEDBACK] ([FeedbackId], [CustomerId], [Message]) VALUES (4, 1, N'fxhtrxf')
SET IDENTITY_INSERT [dbo].[FEEDBACK] OFF
SET IDENTITY_INSERT [dbo].[PAYMENT] ON 

INSERT [dbo].[PAYMENT] ([PaymentId], [ReservationId], [PaymentTime], [TotalAmount], [PaymentStatus]) VALUES (1, 1, CAST(N'2020-09-01 12:17:00.000' AS DateTime), CAST(300.00 AS Decimal(10, 2)), N'Done')
INSERT [dbo].[PAYMENT] ([PaymentId], [ReservationId], [PaymentTime], [TotalAmount], [PaymentStatus]) VALUES (2, 3, CAST(N'2020-08-30 15:22:00.000' AS DateTime), CAST(5400.00 AS Decimal(10, 2)), N'Pending')
SET IDENTITY_INSERT [dbo].[PAYMENT] OFF
SET IDENTITY_INSERT [dbo].[RESERVATION] ON 

INSERT [dbo].[RESERVATION] ([ReservationId], [CustomerId], [VehicleId], [PickupPoint], [ReservationDate], [StartingTime], [ReservationHours], [Cost], [ReservationStatus], [VehicleCount]) VALUES (1, 3, 100004, N'Hatirjheel', CAST(N'2020-09-18' AS Date), CAST(N'07:15:00' AS Time), 3, CAST(300.00 AS Decimal(10, 2)), N'Confirmed', 1)
INSERT [dbo].[RESERVATION] ([ReservationId], [CustomerId], [VehicleId], [PickupPoint], [ReservationDate], [StartingTime], [ReservationHours], [Cost], [ReservationStatus], [VehicleCount]) VALUES (2, 1, 100001, N'Banani', CAST(N'2020-10-18' AS Date), CAST(N'14:30:00' AS Time), 5, CAST(1000.00 AS Decimal(10, 2)), N'Processing', 1)
INSERT [dbo].[RESERVATION] ([ReservationId], [CustomerId], [VehicleId], [PickupPoint], [ReservationDate], [StartingTime], [ReservationHours], [Cost], [ReservationStatus], [VehicleCount]) VALUES (3, 4, 100005, N'Jatrabari', CAST(N'2020-10-24' AS Date), CAST(N'08:00:00' AS Time), 20, CAST(5400.00 AS Decimal(10, 2)), N'Confirmed', 1)
INSERT [dbo].[RESERVATION] ([ReservationId], [CustomerId], [VehicleId], [PickupPoint], [ReservationDate], [StartingTime], [ReservationHours], [Cost], [ReservationStatus], [VehicleCount]) VALUES (4, 2, 100002, N'Gulshan-2', CAST(N'2020-11-01' AS Date), CAST(N'19:45:00' AS Time), 10, CAST(2500.00 AS Decimal(10, 2)), N'Pending', 1)
SET IDENTITY_INSERT [dbo].[RESERVATION] OFF
SET IDENTITY_INSERT [dbo].[VEHICLE] ON 

INSERT [dbo].[VEHICLE] ([VehicleId], [VehicleType], [BrandName], [ModelName], [CostPerHour], [Color]) VALUES (100001, N'Bike', N'Honda', N'XBlade', CAST(200.00 AS Decimal(10, 2)), N'Red')
INSERT [dbo].[VEHICLE] ([VehicleId], [VehicleType], [BrandName], [ModelName], [CostPerHour], [Color]) VALUES (100002, N'Car', N'Toyota', N'Corolla', CAST(250.00 AS Decimal(10, 2)), N'Blue')
INSERT [dbo].[VEHICLE] ([VehicleId], [VehicleType], [BrandName], [ModelName], [CostPerHour], [Color]) VALUES (100003, N'Bike', N'Hero', N'Splendor', CAST(200.00 AS Decimal(10, 2)), N'Black')
INSERT [dbo].[VEHICLE] ([VehicleId], [VehicleType], [BrandName], [ModelName], [CostPerHour], [Color]) VALUES (100004, N'Bicycle', N'Adder', N'KT660', CAST(100.00 AS Decimal(10, 2)), N'Gray')
INSERT [dbo].[VEHICLE] ([VehicleId], [VehicleType], [BrandName], [ModelName], [CostPerHour], [Color]) VALUES (100005, N'Car', N'Ford', N'Figo', CAST(270.00 AS Decimal(10, 2)), N'White')
INSERT [dbo].[VEHICLE] ([VehicleId], [VehicleType], [BrandName], [ModelName], [CostPerHour], [Color]) VALUES (100006, N'Bike', N'Honda', N'XBlade', CAST(200.00 AS Decimal(10, 2)), N'Red')
INSERT [dbo].[VEHICLE] ([VehicleId], [VehicleType], [BrandName], [ModelName], [CostPerHour], [Color]) VALUES (100007, N'Car', N'Toyota', N'Corolla', CAST(250.00 AS Decimal(10, 2)), N'Blue')
INSERT [dbo].[VEHICLE] ([VehicleId], [VehicleType], [BrandName], [ModelName], [CostPerHour], [Color]) VALUES (100008, N'Bike', N'Hero', N'Splendor', CAST(200.00 AS Decimal(10, 2)), N'Black')
INSERT [dbo].[VEHICLE] ([VehicleId], [VehicleType], [BrandName], [ModelName], [CostPerHour], [Color]) VALUES (100009, N'Bicycle', N'Adder', N'KT660', CAST(100.00 AS Decimal(10, 2)), N'Gray')
INSERT [dbo].[VEHICLE] ([VehicleId], [VehicleType], [BrandName], [ModelName], [CostPerHour], [Color]) VALUES (100010, N'Car', N'Ford', N'Figo', CAST(250.00 AS Decimal(10, 2)), N'White')
INSERT [dbo].[VEHICLE] ([VehicleId], [VehicleType], [BrandName], [ModelName], [CostPerHour], [Color]) VALUES (100011, N'Car', N'Hyundai', N'Genesis', CAST(350.00 AS Decimal(10, 2)), N'Red')
INSERT [dbo].[VEHICLE] ([VehicleId], [VehicleType], [BrandName], [ModelName], [CostPerHour], [Color]) VALUES (100012, N'Car', N'Hyundai', N'Tucson', CAST(550.00 AS Decimal(10, 2)), N'Blue')
INSERT [dbo].[VEHICLE] ([VehicleId], [VehicleType], [BrandName], [ModelName], [CostPerHour], [Color]) VALUES (100013, N'Car', N'Tata', N'Tiago', CAST(500.00 AS Decimal(10, 2)), N'White')
SET IDENTITY_INSERT [dbo].[VEHICLE] OFF
SET ANSI_PADDING ON

GO
/****** Object:  Index [UQ__BIKE__6EF5E0424396ABE0]    Script Date: 24-Sep-20 6:01:38 PM ******/
ALTER TABLE [dbo].[BIKE] ADD UNIQUE NONCLUSTERED 
(
	[RegistrationNo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
SET ANSI_PADDING ON

GO
/****** Object:  Index [UQ__CAR__6EF5E0420E30869B]    Script Date: 24-Sep-20 6:01:38 PM ******/
ALTER TABLE [dbo].[CAR] ADD UNIQUE NONCLUSTERED 
(
	[RegistrationNo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
SET ANSI_PADDING ON

GO
/****** Object:  Index [UQ__CUSTOMER__5C7E359E76E59118]    Script Date: 24-Sep-20 6:01:38 PM ******/
ALTER TABLE [dbo].[CUSTOMER] ADD UNIQUE NONCLUSTERED 
(
	[Phone] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
SET ANSI_PADDING ON

GO
/****** Object:  Index [UQ__CUSTOMER__5F5DB915993DCA3A]    Script Date: 24-Sep-20 6:01:38 PM ******/
ALTER TABLE [dbo].[CUSTOMER] ADD UNIQUE NONCLUSTERED 
(
	[DrivingLicense] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
SET ANSI_PADDING ON

GO
/****** Object:  Index [UQ__CUSTOMER__A9D105340A9BB4C2]    Script Date: 24-Sep-20 6:01:38 PM ******/
ALTER TABLE [dbo].[CUSTOMER] ADD UNIQUE NONCLUSTERED 
(
	[Email] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
ALTER TABLE [dbo].[BICYCLE]  WITH CHECK ADD FOREIGN KEY([VehicleId])
REFERENCES [dbo].[VEHICLE] ([VehicleId])
GO
ALTER TABLE [dbo].[BIKE]  WITH CHECK ADD FOREIGN KEY([VehicleId])
REFERENCES [dbo].[VEHICLE] ([VehicleId])
GO
ALTER TABLE [dbo].[CANCEL]  WITH CHECK ADD FOREIGN KEY([ReservationId])
REFERENCES [dbo].[RESERVATION] ([ReservationId])
GO
ALTER TABLE [dbo].[CAR]  WITH CHECK ADD FOREIGN KEY([VehicleId])
REFERENCES [dbo].[VEHICLE] ([VehicleId])
GO
ALTER TABLE [dbo].[FEEDBACK]  WITH CHECK ADD FOREIGN KEY([CustomerId])
REFERENCES [dbo].[CUSTOMER] ([CustomerId])
GO
ALTER TABLE [dbo].[PAYMENT]  WITH CHECK ADD FOREIGN KEY([ReservationId])
REFERENCES [dbo].[RESERVATION] ([ReservationId])
GO
ALTER TABLE [dbo].[RESERVATION]  WITH CHECK ADD FOREIGN KEY([CustomerId])
REFERENCES [dbo].[CUSTOMER] ([CustomerId])
GO
ALTER TABLE [dbo].[RESERVATION]  WITH CHECK ADD FOREIGN KEY([VehicleId])
REFERENCES [dbo].[VEHICLE] ([VehicleId])
GO
ALTER TABLE [dbo].[EXTRA_STORAGE]  WITH CHECK ADD CHECK  (([Availability]='Yes' OR [Availability]='No'))
GO
ALTER TABLE [dbo].[EXTRA_STORAGE]  WITH CHECK ADD CHECK  (([NumbreOfVehicles]>(0)))
GO
ALTER TABLE [dbo].[RESERVATION]  WITH CHECK ADD CHECK  (([ReservationHours]>=(3)))
GO
ALTER TABLE [dbo].[VEHICLE]  WITH CHECK ADD CHECK  (([VehicleType]='Car' OR [VehicleType]='Bike' OR [VehicleType]='Bicycle'))
GO
USE [master]
GO
ALTER DATABASE [Rental] SET  READ_WRITE 
GO
