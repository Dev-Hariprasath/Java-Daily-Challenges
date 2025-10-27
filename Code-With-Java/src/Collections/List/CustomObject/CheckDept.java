package Collections.List.CustomObject;

public class CheckDept {
    public static void main(String[] args) {
        long c = Employee.getEmployees()
                .stream()
                .map(Employee::getDepartment)
                .distinct()
                .count();

        System.out.println(c == 1 ?
                "All Employees Belongs to same department" :
                "No All Employees Belongs to same department"
        );
    }
}
