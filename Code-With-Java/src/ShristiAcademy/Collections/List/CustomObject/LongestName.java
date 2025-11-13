package ShristiAcademy.Collections.List.CustomObject;

import java.util.Comparator;

public class LongestName {
    public static void main(String[] args) {
        String name = Employee.getEmployees()
                .stream()
                .map(Employee::getName)
                .max(Comparator.comparing(String::length))
                .orElse("NO Name");

        System.out.println("The Longest name is " +name);
    }
}
