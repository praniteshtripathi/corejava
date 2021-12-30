package rnd.program.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GroupSalaryByDept {
    public static void main(String args[]){
        List<Employee> empList= new ArrayList<>();
        Employee e1= new Employee(1,"sales",1000);
        Employee e2= new Employee(2,"sales",2000);
        Employee e3= new Employee(3,"medical",3000);
        Employee e4= new Employee(4,"lab",4000);
        Employee e5= new Employee(5,"lab",5000);

        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);
        empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.summingDouble(Employee::getSalary) )).forEach((k,v)->{System.out.println(k+"---"+v);});
    }
}
