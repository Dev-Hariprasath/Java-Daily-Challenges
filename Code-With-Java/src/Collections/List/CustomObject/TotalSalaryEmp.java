package Collections.List.CustomObject;

import java.util.List;

public class TotalSalaryEmp {
    public static void main(String[] args) {
        List<Employee> employees = Employee.getEmployees();

        double total = employees.stream()
                .map(Employee::getSalary)
                .mapToDouble(e -> e)
                .sum();

        System.out.println("Total salary of Employees " +total);
    }
}
