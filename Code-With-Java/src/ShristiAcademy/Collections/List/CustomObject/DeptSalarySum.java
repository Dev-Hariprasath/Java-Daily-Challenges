package ShristiAcademy.Collections.List.CustomObject;

import java.util.stream.Collectors;

public class DeptSalarySum {
    public static void main(String[] args) {
        Employee.getEmployees()
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)))
                .forEach((k, v)
                        -> System.out.println("Department is " + k + " and sum is " + v));
    }
}
