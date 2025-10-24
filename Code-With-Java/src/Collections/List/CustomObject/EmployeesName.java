package Collections.List.CustomObject;

import java.util.Comparator;
import java.util.List;

public class EmployeesName {
    public static void main(String[] args) {
        List<Employee> employees = Employee.getEmployees();

        employees.stream()
                .map(e -> e.getName().toUpperCase())
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

    }
}
