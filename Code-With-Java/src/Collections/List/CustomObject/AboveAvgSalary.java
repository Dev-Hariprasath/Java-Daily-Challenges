package Collections.List.CustomObject;

public class AboveAvgSalary {
    public static void main(String[] args) {

        double avg = Employee.getEmployees()
                .stream()
                .map(Employee::getSalary)
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0);

        System.out.println("The average salary is " +avg);

        Employee.getEmployees()
                .stream()
                .filter(e -> e.getSalary() > avg)
                .forEach(System.out::println);
    }
}
