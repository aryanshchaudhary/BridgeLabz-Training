package level_3;
import java.util.*;
public class Bonus {
    static Object[] generateEmployeeData(int n) {
        double[] salary = new double[n];
        int[] years = new int[n];
        for (int i = 0; i < n; i++) {
            salary[i] = 10000 + Math.random() * 90000;   
            years[i] = 1 + (int)(Math.random() * 10);   
        }
        return new Object[]{salary, years};
    }
    static double[][] calculateBonus(double[] salary, int[] years) {
        double[][] result = new double[salary.length][2];
        for (int i = 0; i < salary.length; i++) {
            if (years[i] > 5)
                result[i][0] = salary[i] * 0.05;
            else
                result[i][0] = salary[i] * 0.02;

            result[i][1] = salary[i] + result[i][0];
        }
        return result;
    }
    static void displayReport(double[] salary, int[] years, double[][] result) {
        double totalOld = 0, totalBonus = 0, totalNew = 0;
        System.out.println("Emp\tOldSalary\tYears\tBonus\t\tNewSalary");
        for (int i = 0; i < salary.length; i++) {
            totalOld += salary[i];
            totalBonus += result[i][0];
            totalNew += result[i][1];
            System.out.printf("%d\t%.2f\t%d\t%.2f\t%.2f\n",
                    (i + 1),
                    salary[i],
                    years[i],         
                    result[i][0],
                    result[i][1]);
        }
        System.out.printf("TOTAL\t%.2f\t\t\t%.2f\t%.2f\n",
                totalOld, totalBonus, totalNew);
    }
    public static void main(String[] args) {
        int employees = 10;
        Object[] data = generateEmployeeData(employees);
        double[] salary = (double[]) data[0];
        int[] years = (int[]) data[1];
        double[][] bonusData = calculateBonus(salary, years);
        displayReport(salary, years, bonusData);
    }
}

