package ShristiAcademy.Collections.List.CustomObject;

import java.util.*;

public class Employee {

    private int id;
    private String name;
    private String city;
    private String department;
    private double salary;

    public Employee(){

    }

    private Employee(int id, String name, String city, String department, double salary) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.department = department;
        this.salary = salary;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee(1, "Hari", "Chennai", "IT", 65000),
                new Employee(2, "Prasath", "Bangalore", "HR", 55000),
                new Employee(3, "Ganesh", "Hyderabad", "Finance", 72000),
                new Employee(4, "Ram", "Chennai", "IT", 80000),
                new Employee(5, "Mohan", "Pune", "Sales", 50000),
                new Employee(6, "Vijay", "Mumbai", "HR", 60000),
                new Employee(7, "Karthik", "Chennai", "Finance", 90000),
                new Employee(8, "Ravi", "Bangalore", "IT", 75000),
                new Employee(9, "Suresh", "Hyderabad", "Sales", 48000),
                new Employee(10, "Arun", "Pune", "Finance", 82000),
                new Employee(11, "Kiran", "Mumbai", "IT", 95000),
                new Employee(12, "Dinesh", "Chennai", "HR", 62000),
                new Employee(13, "Sathish", "Bangalore", "Finance", 88000),
                new Employee(14, "Rajesh", "Hyderabad", "Sales", 53000),
                new Employee(15, "Gokul", "Pune", "IT", 71000),
                new Employee(16, "Manoj", "Chennai", "HR", 57000),
                new Employee(17, "Naveen", "Bangalore", "Finance", 94000),
                new Employee(18, "Deepak", "Hyderabad", "Sales", 61000),
                new Employee(19, "Kumar", "Pune", "IT", 78000),
                new Employee(20, "Bala", "Chennai", "Finance", 87000)
        );
    }

    @Override
    public String toString() {
        return String.format("Employee{id=%d, name='%s', city='%s', dept='%s', salary=%.2f}",
                id, name, city, department, salary);
    }
}

