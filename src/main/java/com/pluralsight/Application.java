package com.pluralsight;

public class Application {
    public static void main(String[] args) {
        Reservation reservation1 = new Reservation("king", 3, true);
        Reservation reservation2 = new Reservation("double", 5, false);
        System.out.println(reservation1.getReservationTotal());
        System.out.println(reservation2.getReservationTotal());
    }
}
