package Collections.List.CustomObject;

import java.util.Map;
import java.util.stream.Collectors;

public class HighestAvgSalaryDept {
    public static void main(String[] args) {

        String dept = " ";
        Double sal = 0.0;
        Map<String, Double> frq = Employee.getEmployees()
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));

        for ( String k : frq.keySet()){
             if(sal < frq.get(k)) {
                 dept = k;
                 sal = frq.get(k);
             }
        }

        System.out.println("The Highest salary Dept is " + dept + " - " + sal);
    }
}
