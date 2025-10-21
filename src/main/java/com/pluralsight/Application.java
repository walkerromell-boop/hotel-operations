package com.pluralsight;

public class Application {
    public static void main(String[] args) {
        Reservation reservation1 = new Reservation("king", 3, true);
        Reservation reservation2 = new Reservation("double", 5, false);
        System.out.println(reservation1.getReservationTotal());
        System.out.println(reservation2.getReservationTotal());

        Hotel hiltonHead = new Hotel("Hilton Head", 20, 100, 0, 0);
        System.out.println(hiltonHead);
        if (hiltonHead.bookRoom(10,false)){
            System.out.println(hiltonHead);
        }else {
            System.out.println("Begone From my Palace");}

        if (hiltonHead.bookRoom(2, true)) {
            System.out.println(hiltonHead);
        }else {
            System.out.println("Nah");
        }



    }
}
