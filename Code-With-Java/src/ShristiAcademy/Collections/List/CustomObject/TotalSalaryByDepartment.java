package ShristiAcademy.Collections.List.CustomObject;

import java.util.List;
import java.util.stream.Collectors;

public class TotalSalaryByDepartment {
    public static void main(String[] args) {
        List<Employee> employees = Employee.getEmployees();

        employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.summingDouble(Employee::getSalary)))
                .forEach((e, v)
                        -> System.out.println("The Department is " + e + " & Total is " + v));

    }
}
