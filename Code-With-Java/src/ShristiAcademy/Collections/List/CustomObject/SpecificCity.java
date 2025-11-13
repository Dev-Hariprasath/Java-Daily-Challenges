package ShristiAcademy.Collections.List.CustomObject;

import java.util.List;
import java.util.stream.Collectors;

public class SpecificCity {
    public static void main(String[] args) {
        List<Employee> employees = Employee.getEmployees();

        employees.stream()
                .collect(Collectors.groupingBy(Employee::getCity , Collectors.counting()))
                .forEach(
                        (k, v) ->
                                System.out.println("The City is " + k + " And Count Of Employee is " +v)
                );
    }
}
