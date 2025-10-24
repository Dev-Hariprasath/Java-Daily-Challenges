package Collections.List.CustomObject;

import java.util.Comparator;

public class HighestSalary {
    public static void main(String[] args) {
        Employee e = Employee.getEmployees()
                .stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .findFirst()
                .orElse(new Employee());

        System.out.println(e);
    }
}
