package Collections.List.CustomObject;

import java.util.stream.Collectors;

public class GroupEmpByDept {
    public static void main(String[] args) {
        Employee.getEmployees()
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getName, Collectors.toList())))
                .forEach((k, v)
                        -> System.out.println("The Department is " + k + " and Employee list is " + v));
    }
}
