package com.pluralsight;

public class Employee {
    private int employeeId;
    private String employeeName;
    private String department;
    private double payRate;
    private double hoursWorked;
    private final double REGULAR_HOURS = 40;
    private final double OVERTIME_PAY_RATE = 1.15;

//    public double getTotalPay() {
//        double totalPay = this.payRate * this.hoursWorked;
//        return totalPay;
//    }

//    public double getTotalPay() {
//        return (getRegularHours() * payRate) + (getOvertimeHours() * OVERTIME_PAY_RATE);
//    }

    public double getTotalPay() {
        double regularPay = getRegularHours() * payRate;
        double overtimePay = getOvertimeHours() * OVERTIME_PAY_RATE;
        return regularPay + overtimePay;
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
