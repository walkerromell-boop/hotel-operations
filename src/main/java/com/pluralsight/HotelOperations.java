package com.pluralsight;

public class HotelOperations {

    public class Room {
        private int numberOfBeds;
        private double price;
        private boolean isOccupied;
        private boolean isDirty;
        private boolean isAvailable;

        public int getNumberOfBeds() {
            return numberOfBeds;
        }

        public double getPrice() {
            return price;
        }

        public boolean isOccupied() {
            return isOccupied;
        }

        public boolean isDirty() {
            return isDirty;
        }

        public boolean isAvailable() {
            return isAvailable;
        }
    }


    public class Reservation {
        public String roomType;
        //        public double price;
        public int numberOfNights;
        public boolean isWeekend;
//        public int reservationTotal;

        public String getRoomType() {
            return roomType;
        }

        public void setRoomType(String roomType) {
            this.roomType = roomType;
        }

        public int getNumberOfNights() {
            return numberOfNights;
        }

        public void setNumberOfNights(int numberOfNights) {
            this.numberOfNights = numberOfNights;
        }

        public boolean isWeekend() {
            return isWeekend;
        }

        public void setWeekend(boolean weekend) {
            isWeekend = weekend;
        }

//        derived methods

        public double getPrice() {
            return switch (roomType.toLowerCase()) {
                case "king" -> 139;
                case "double" -> 124;
                default -> throw new IllegalArgumentException("Invalid room type: " + roomType);
            };
        }

        public double getReservationTotal() {
            double total = getPrice() * numberOfNights;
            if (isWeekend) {    //If the stay over a weekend, the price is increased by 10%
                total = total * 1.10;
            }
            return total;
        }
    }


    public class Employee {
        private int employeeId;
        public String employeeName;
        public String department;
        private double payrate;
        private double hoursWorked;

    }
}

