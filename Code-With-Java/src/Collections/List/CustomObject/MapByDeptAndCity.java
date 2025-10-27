package Collections.List.CustomObject;

import java.util.stream.Collectors;

public class MapByDeptAndCity {
    public static void main(String[] args) {
        Employee.getEmployees()
                .stream()
                .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.groupingBy(Employee::getCity)))
                .forEach((department, cities) -> {
                    System.out.println("===== The departments is " + department + "======");
                    System.out.println();
                    cities.forEach((city, emp) -> {
                        System.out.println("City - " + city);
                        emp.stream()
                                .map(Employee::getName)
                                .forEach(System.out::println);
                    });
                });
    }
}
