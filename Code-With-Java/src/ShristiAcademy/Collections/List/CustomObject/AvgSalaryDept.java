package ShristiAcademy.Collections.List.CustomObject;

import java.util.stream.Collectors;

public class AvgSalaryDept {
    public static void main(String[] args) {
        Employee.getEmployees()
                .stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)))
                .forEach((k, v) ->
                        System.out.println("The department is " + k + " -  Average salary is " +v));

    }
}
