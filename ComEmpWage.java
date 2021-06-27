package com.emp;

public class ComEmpWage {
    //instance variable
    public  String companyName;
    public int wagePerHr;
    public int totalWorkingDays;
    public int maxHrsPerMonth;
    public int totalEmpWage;

    //we have instance variables  so we are defining the constructor
    public ComEmpWage(String companyName, int wagePerHr, int totalWorkingDays, int maxHrsPerMonth) {
        this.companyName = companyName;
        this.wagePerHr = wagePerHr;
        this.totalWorkingDays = totalWorkingDays;
        this.maxHrsPerMonth = maxHrsPerMonth;
        totalEmpWage=0;
    }
    //creating method
    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }
    @Override
    public String toString() {

        return "Total wage of employee of a company" + companyName + "is:"+ totalEmpWage;
    }
}
