package ShristiAcademy.Collections.List.CustomObject;

import java.util.Comparator;

public class SecondHighestSalary {
    public static void main(String[] args) {
        Employee emp = Employee.getEmployees()
                .stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .findFirst()
                .orElse(new Employee());

        System.out.println(emp);
    }
}
