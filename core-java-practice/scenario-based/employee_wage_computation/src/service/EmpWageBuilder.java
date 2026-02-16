package service;

import model.CompanyEmpWage;
import java.util.*;

public class EmpWageBuilder implements IEmpWageBuilder {

    private static final int IS_PART_TIME = 1;
    private static final int IS_FULL_TIME = 2;

    private ArrayList<CompanyEmpWage> companyList;
    private Map<String, CompanyEmpWage> companyMap;

    public EmpWageBuilder() {
        companyList = new ArrayList<>();
        companyMap = new HashMap<>();
    }

    @Override
    public void addCompanyEmpWage(String company,
                                  int empRatePerHour,
                                  int numOfWorkingDays,
                                  int maxHoursPerMonth) {

        CompanyEmpWage companyEmpWage =
                new CompanyEmpWage(company, empRatePerHour,
                        numOfWorkingDays, maxHoursPerMonth);

        companyList.add(companyEmpWage);
        companyMap.put(company, companyEmpWage);
    }

    @Override
    public void computeEmpWage() {

        for (CompanyEmpWage company : companyList) {

            int totalHours = 0;
            int totalDays = 0;

            while (totalDays < company.getNumOfWorkingDays()
                    && totalHours <= company.getMaxHoursPerMonth()) {

                totalDays++;
                int empHrs = 0;

                int empCheck = (int) (Math.random() * 3);

                switch (empCheck) {
                    case IS_PART_TIME:
                        empHrs = 4;
                        break;
                    case IS_FULL_TIME:
                        empHrs = 8;
                        break;
                    default:
                        empHrs = 0;
                }

                totalHours += empHrs;
                int dailyWage = empHrs * company.getEmpRatePerHour();
                company.addDailyWage(dailyWage);
            }

            int totalWage = totalHours * company.getEmpRatePerHour();
            company.setTotalEmpWage(totalWage);

            System.out.println(company);
        }
    }

    @Override
    public int getTotalWage(String company) {
        if (companyMap.containsKey(company)) {
            return companyMap.get(company).getTotalEmpWage();
        }
        return 0;
    }
}
