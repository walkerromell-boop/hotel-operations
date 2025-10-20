package com.pluralsight;

public class HotelOperations {

    public class Room {
private int numberOfBeds;
private int price;
public boolean isOccupied;
public boolean isDirty;
public boolean isAvailable;

    }


    public class Reservation {
        public String roomType;
        public double price;
        public int numberOfNights;
        public boolean isWeekend;
        public int reservationTotal;
    }


    public class Employee {
        private int employeeId;
        public String employeeName;
    }
}
