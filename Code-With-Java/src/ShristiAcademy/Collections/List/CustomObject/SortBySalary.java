package ShristiAcademy.Collections.List.CustomObject;

import java.util.Comparator;

public class SortBySalary {
    public static void main(String[] args) {
        Employee.getEmployees()
                .stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .forEach(System.out::println);
    }
}
