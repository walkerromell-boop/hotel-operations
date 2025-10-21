package com.pluralsight;

public class Employee {
    private int employeeId;
    private String employeeName;
    private String department;
    private double payrate;
    private double hoursWorked;
    private double REGULAR_HOURS = 40;

    public double getTotalPay() {
        double totalPay = this.payrate * this.hoursWorked;
        return totalPay;
    }

    public double getRegularHours() {
        if (hoursWorked <= REGULAR_HOURS) {
            return hoursWorked;
        } else {
            return REGULAR_HOURS;
        }
    }

    public double getOvertimeHours() {
        if (hoursWorked > REGULAR_HOURS) {
            return hoursWorked - REGULAR_HOURS;
        } else {
            return 0;
        }
    }

}
