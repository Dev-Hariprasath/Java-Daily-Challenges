package ShristiAcademy.Collections.List.CustomObject;

import java.util.stream.Collectors;

public class EmployeeWIthSalary {
    public static void main(String[] args) {
        Employee.getEmployees()
                .stream()
                .collect(Collectors.groupingBy(Employee::getName, Collectors.summingDouble(Employee::getSalary)))
                .forEach((k, v) -> System.out.println("Name - " + k + " & Salary - " + v));
    }
}
