package Collections.List.CustomObject;

import java.util.stream.Collectors;

public class EmpCountDept {
    public static void main(String[] args) {
        Employee.getEmployees()
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
                .forEach((k, v) ->
                        System.out.println("The department name is " + k + " and Employee count is " + v));
    }
}
