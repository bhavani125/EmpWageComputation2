package com.emp;

public class ComEmpWage {
    //instance variable
    public final String company;
    public final int wagePerHr;
    public final int totalWorkingDays;
    public final int maxHrsPerMonth;
    public int totalEmpWage;

    //we have instance variables  so we are defining the constructor
    public ComEmpWage(String company, int wagePerHr, int totalWorkingDays, int maxHrsPerMonth) {
        this.company = company;
        this.wagePerHr = wagePerHr;
        this.totalWorkingDays = totalWorkingDays;
        this.maxHrsPerMonth = maxHrsPerMonth;
    }
    //creating method
    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }
    @Override
    public String toString() {

        return "Total wage of employee of a company" + company + "is:"+ totalEmpWage;
    }
}
