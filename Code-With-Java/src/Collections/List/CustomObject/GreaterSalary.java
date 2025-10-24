package Collections.List.CustomObject;

import java.util.List;

public class GreaterSalary {
    public static void main(String[] args) {
        List<Employee> employees = Employee.getEmployees();

        employees.stream()
                .filter(e -> e.getSalary() > 50000)
                .forEach(System.out::println);
    }
}
