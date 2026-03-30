package user_interface;

import service.EmpWageBuilder;
import service.IEmpWageBuilder;

public class EmployeeWageApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        IEmpWageBuilder empWageBuilder = new EmpWageBuilder();

        empWageBuilder.addCompanyEmpWage("TCS", 20, 20, 100);
        empWageBuilder.addCompanyEmpWage("Infosys", 25, 22, 110);
        empWageBuilder.addCompanyEmpWage("Wipro", 30, 18, 90);

        empWageBuilder.computeEmpWage();

        System.out.println("Total Wage of TCS: "
                + empWageBuilder.getTotalWage("TCS"));
    }
}
