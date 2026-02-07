package collectors;
import java.util.*;
import java.util.stream.*;

class Employee {
    String department;
    double salary;

    Employee(String department, double salary) {
        this.department = department;
        this.salary = salary;
    }
}

public class AvgSalaryByDept {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("IT", 50000),
                new Employee("HR", 40000),
                new Employee("IT", 60000)
        );

        Map<String, Double> avgSalary =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                e -> e.department,
                                Collectors.averagingDouble(e -> e.salary)
                        ));

        System.out.println(avgSalary);
    }
}
