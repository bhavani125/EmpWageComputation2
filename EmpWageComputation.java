package com.emp;

import java.util.ArrayList;
import java.util.List;

    public class EmpWageComputation implements EmpWageInterface {
    //constant variables
    public static final int isFullTime = 1;
    public static final int isPartTime = 2;

    private int numOfCompany = 0;

    //here we are defining the array
    private  List<ComEmpWage> comEmpWageArray;

    public EmpWageComputation() {
        //initializing the array
        comEmpWageArray = new ArrayList<ComEmpWage>();

    }

    // main method
    public static void main(String[] args) {
        System.out.println("Welcome to employee  wage computation problem ");
        //creating object
        EmpWageComputation empWage = new EmpWageComputation();
        empWage.addComEmpWage("dMart", 20, 28, 10);
        empWage.addComEmpWage("jio", 25, 25, 15);
        empWage.calculatingEmpWages();
    }

    @Override
    public void addComEmpWage(String companyName, int wagePerHr, int totalWorkingDays, int maxHrsPerMonth) {
       ComEmpWage comEmpWage =new ComEmpWage(companyName,wagePerHr,totalWorkingDays,maxHrsPerMonth);
       comEmpWageArray.add(comEmpWage);
    }



       @Override
        public void calculatingEmpWages() {
        for (int i = 0; i < comEmpWageArray.size(); i++) {
          ComEmpWage comEmpWage= comEmpWageArray.get(i);
          comEmpWage.setTotalEmpWage(calculatingEmpWages(comEmpWage));
          System.out.println(comEmpWage);
        }
    }

    // calculating emp wages
    private int calculatingEmpWages(ComEmpWage comEmpWage) {
        //local variables
        int workingHrs = 0;
        int monthlyTotalWage = 0;
        int totalEmpHrs = 0;
        int days = 0;
        int dailyWageArray[] = new int[comEmpWage.totalWorkingDays];
        ///computation
        while (days <= comEmpWage.totalWorkingDays && totalEmpHrs < comEmpWage.maxHrsPerMonth) {

            int empCheck = (int) (Math.floor(Math.random() * 10)) % 3;
            switch (empCheck) {
                case isFullTime:
                    workingHrs = 8;
                    break;
                case isPartTime:
                    workingHrs = 4;
                    break;
                default:
                    workingHrs = 0;
            }
            totalEmpHrs += workingHrs;
            dailyWageArray[days] = workingHrs * comEmpWage.wagePerHr;
            days++;
        }
        for (int j = 0; j < comEmpWage.totalWorkingDays; j++) {
            int day = j + 1;
            monthlyTotalWage = monthlyTotalWage + dailyWageArray[j];
        }

        return monthlyTotalWage;
    }
}








