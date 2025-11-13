package ShristiAcademy.Collections.List.CustomObject;

import java.util.List;

public class SumAndAvg {
    public static void main(String[] args) {
        List<Employee> employees = Employee.getEmployees();

        double sum = employees.stream()
                .mapToDouble(Employee::getSalary)
                .sum();

        double avg = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);

        System.out.println("The Sum is " + sum + " and Average is " + avg + "Of all Employees.");
    }
}
