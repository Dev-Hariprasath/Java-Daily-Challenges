package ShristiAcademy.Collections.List.CustomObject;

import java.util.*;

public class Student {

    private int id;
    private String name;
    private String city;
    private String department;
    private double marks;

    private Student(int id, String name, String city, String department, double marks) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.department = department;
        this.marks = marks;
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

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public static List<Student> getStudents() {
        return Arrays.asList(
                new Student(1, "Hari", "Chennai", "CSE", 85.5),
                new Student(2, "Prasath", "Bangalore", "ECE", 78.0),
                new Student(3, "Ganesh", "Hyderabad", "IT", 91.2),
                new Student(4, "Ram", "Pune", "MECH", 67.8),
                new Student(5, "Mohan", "Chennai", "EEE", 88.4),
                new Student(6, "Vijay", "Mumbai", "CSE", 95.0),
                new Student(7, "Karthik", "Bangalore", "IT", 82.3),
                new Student(8, "Ravi", "Hyderabad", "ECE", 74.6),
                new Student(9, "Suresh", "Pune", "MECH", 69.2),
                new Student(10, "Arun", "Chennai", "CSE", 90.5),
                new Student(11, "Kiran", "Mumbai", "EEE", 84.1),
                new Student(12, "Dinesh", "Bangalore", "IT", 87.9),
                new Student(13, "Sathish", "Hyderabad", "ECE", 92.0),
                new Student(14, "Rajesh", "Pune", "CSE", 76.8),
                new Student(15, "Gokul", "Chennai", "MECH", 80.2),
                new Student(16, "Manoj", "Bangalore", "EEE", 89.4),
                new Student(17, "Naveen", "Hyderabad", "IT", 94.6),
                new Student(18, "Deepak", "Pune", "ECE", 71.0),
                new Student(19, "Kumar", "Mumbai", "MECH", 73.5),
                new Student(20, "Bala", "Chennai", "CSE", 97.3)
        );
    }

    @Override
    public String toString() {
        return String.format("Student{id=%d, name='%s', city='%s', dept='%s', marks=%.1f}",
                id, name, city, department, marks);
    }
}
