package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedBasicRooms = 0;
        this.bookedSuites = 0;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public int getAvailableRooms() {
        return numberOfRooms - bookedBasicRooms;
    }

    public int getAvailbleSuites() {
        return numberOfSuites - bookedSuites;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        boolean isBasicRoom = !isSuite;
        if (isBasicRoom && (getAvailableRooms() >= numberOfRooms)) {
            bookedBasicRooms += numberOfRooms;
            return true;
        }
        if (isSuite && (getAvailbleSuites() >= numberOfSuites)) {
            bookedSuites += numberOfRooms;
            return true;
        }
        return false;
    }




    @Override
    public String toString() {
        return "Hotel" +
                "name= " + name  +
                ", numberOfSuites=" + numberOfSuites +
                ", numberOfRooms=" + numberOfRooms +
                ", bookedSuites=" + bookedSuites +
                ", bookedBasicRooms=" + bookedBasicRooms ;
    }
}
