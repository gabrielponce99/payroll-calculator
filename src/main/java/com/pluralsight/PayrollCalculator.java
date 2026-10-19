package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        //Step 1
        //Create a Java application named payroll-calculator
        //that prompts the user to enter:
        Scanner scanner = new Scanner(System.in);

        //their name
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        //their hours worked (a floating point number)
        System.out.println("How many hours have you worked?: ");
        double hours = scanner.nextFloat();

        //their pay rate (a floating point number)
        System.out.println("How much is the pay rate?: ");
        double payRate = scanner.nextFloat();

        //Calculate their gross pay.
        double paycheck = payRate * hours;

        if (hours > 40) {
            double overtime = hours - 40;
            double overtimeRate = payRate * 1.5;
            double overtimePay = overtimeRate * overtime;
            double totalPay = paycheck + overtimePay;
            System.out.printf("Your check is: $%.2f\n", totalPay);
            System.out.printf("Enjoy Las Vegas, %s!", name);
        } else {
            System.out.printf("Your check is: $%.2f\n", paycheck);
            System.out.printf("Enjoy Las Vegas, %s!", name);
        }

        //Display the employee's name and their gross pay.


    }
}