package com.emp;

public class EmpWageComputation {
    //constant variables
    public static final int isFullTime = 1;
    public static final int isPartTime = 2;

    private int numOfCompany = 0;

    //here we are defining the array
    private ComEmpWage[] comEmpWageArray;

    public EmpWageComputation() {
        //initializing the array
        comEmpWageArray = new ComEmpWage[5];

    }
    // main method
    public static void main(String[] args) {
        System.out.println("Welcome to employee  wage computation problem ");
        //creating an object
        EmpWageComputation empWage = new EmpWageComputation();
        empWage.addComEmpWage("dMart", 20, 3, 10);
        empWage.addComEmpWage("jio", 25, 2, 15);
        empWage.calculatingEmpWages();
    }

    private void addComEmpWage(String company, int wagePerHr, int totalWorkingDays, int maxHrsPerMonth) {

        comEmpWageArray[numOfCompany] = new ComEmpWage(company, wagePerHr, totalWorkingDays, maxHrsPerMonth);
        numOfCompany++;
    }
    //creating method
    private void calculatingEmpWages() {
        for (int i = 0; i < numOfCompany; i++) {
            comEmpWageArray[i].setTotalEmpWage(this.calculatingEmpWages(comEmpWageArray[i]));
        }
    }

    // calculating emp wages
    public int calculatingEmpWages(ComEmpWage comEmpWage) {
        //local variables
        int workingHrs = 0;
        int numberOfWorkingDays = 0;
        int totalEmpHrs = 0;
        ///computation
        while (totalEmpHrs <= comEmpWage.maxHrsPerMonth && numberOfWorkingDays < comEmpWage.totalWorkingDays) {
            numberOfWorkingDays++;
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
            System.out.println("Day#" + numberOfWorkingDays + " he worked for " + workingHrs + " hours ");
        }
        return totalEmpHrs * comEmpWage.wagePerHr;
    }
}



