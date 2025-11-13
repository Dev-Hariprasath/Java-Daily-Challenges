package ShristiAcademy.Collections.List.CustomObject;

import java.util.List;

public class CheckAllEmpSalary {
    public static void main(String[] args) {
        List<Employee> employees = Employee.getEmployees();

        long count = employees.stream()
                .filter(e -> e.getSalary() < 50000)
                .count();

        System.out.println(count == 0 ? "All Employees will have Expect Salary"
                : count + " Employees will have less salary");
    }
}
