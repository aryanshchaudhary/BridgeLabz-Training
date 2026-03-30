package model;

import java.util.ArrayList;

public class CompanyEmpWage {

    private String company;
    private int empRatePerHour;
    private int numOfWorkingDays;
    private int maxHoursPerMonth;

    private int totalEmpWage;
    private ArrayList<Integer> dailyWageList;

    public CompanyEmpWage(String company, int empRatePerHour,
                          int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
        this.dailyWageList = new ArrayList<>();
    }

    public void addDailyWage(int wage) {
        dailyWageList.add(wage);
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    public int getEmpRatePerHour() {
        return empRatePerHour;
    }

    public int getNumOfWorkingDays() {
        return numOfWorkingDays;
    }

    public int getMaxHoursPerMonth() {
        return maxHoursPerMonth;
    }

    public int getTotalEmpWage() {
        return totalEmpWage;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "Company: " + company +
                "\nTotal Wage: " + totalEmpWage +
                "\nDaily Wages: " + dailyWageList + "\n";
    }
}
