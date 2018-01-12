package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
      System.out.println("Hello, Welcome to the Human Resource Salary Calculator");
      Scanner sc = new Scanner(System.in);
        System.out.println("This calculator will calculate an employee's annual salary into bi-weekly, bi-monthly and monthly paychecks.");
        System.out.println("YOu will need the employees First and Last name, Employee number and their annual salary.");
        String nextEmp = ("Yes");
        while (nextEmp.equalsIgnoreCase("Yes")){
        System.out.println("Please enter the employee's first name");
        String firstName = sc.nextLine();
        System.out.println("Please enter the employee's Last name.");
        String lastName = sc.nextLine();
        System.out.println("Enter employee number.");
        String empNum = sc.nextLine();
        System.out.println("Enter employee's annual salary without the dollar sign or comma");
        String empSalaryS = sc.nextLine ();
        double empSalaryI = Double.parseDouble(empSalaryS);
        double twoWeeks = empSalaryI /26;
        double biMon = empSalaryI /24;
        double Mon = empSalaryI /12;
          DecimalFormat format = new DecimalFormat("##.00");
        System.out.println("Salary breakdown for  " + firstName + " "+ lastName + ":");
        System.out.println("Bi-weekly Salary: $" + format.format(twoWeeks));
        System.out.println("Bi-monthly Salary: $" + format.format(biMon));
        System.out.println("Monthly Salary: $" + format.format(Mon));
        System.out.println("Would you like to calculate the Salary for another employee?");
        nextEmp = sc.nextLine();

        if (nextEmp.equalsIgnoreCase("Yes")){
            System.out.println("Okay");
            System.out.println("");

            } else {
            System.out.println("Thank you for using the HR Salary Calculator.");
        }

        }

    }
}
//following is the simplified and correct way to solve the D4 Challenge
