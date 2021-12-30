package rnd.program.java8.realtimequery;

import java.util.*;
import java.util.stream.Collectors;
//https://javaconceptoftheday.com/solving-real-time-queries-using-java-8-features-employee-management-system/
public class EmployeeDemo {
    public static void main(String args[]){
       //System.out.println("Count Male and Female");
        // countMaleAndFemale();
       //System.out.println("Print Department");
        // printDepartment();
        //System.out.println("Print average age of male and female employee ");
        //averageAge();
       // System.out.println("Highest paid employee ");
        //Employee e=highestPaidEmployee();

        //printEmployee(e);
        //printEmployeeNameJoinedAfter2015();

        //countEmpDeptWise();

        //printAverageSalaryOfDept();

        //getYoungestEmpFromProductDept();

        //printDeptWiseEmployeeList();
        concatenateEmployee();
    }
     // concatenate  employee name with comma
    public static void concatenateEmployee(){
        List<Employee> employeeList= getEmployeeList();
        String employeeName=employeeList.stream().map(Employee::getName).collect(Collectors.joining(","));
        System.out.println(employeeName);
    }
    // Department wise employee list
    public static void printDeptWiseEmployeeList(){
        List<Employee> employeeList= getEmployeeList();
        Map<String,List<Employee>> deptWiseEmployeeList=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        deptWiseEmployeeList.forEach((k,v)->{
            System.out.println("----------Department--------  :"+k.toUpperCase() +" :");
            for(Employee e:v){
                System.out.println("Employee Name :"+e.getName());
                System.out.println("Employee age :"+e.getAge());
            }
        ;});
    }
    //Get the details of youngest male employee in the product development department?
    public static void getYoungestEmpFromProductDept(){
        List<Employee> employeeList= getEmployeeList();
        Optional<Employee> employeeOptional=employeeList.stream().filter(e->e.getGender()=="Male" && e.getDepartment()=="Product Development").min(Comparator.comparingInt(Employee::getAge));
        Employee emp = employeeOptional.get();
        System.out.println("name "+ emp.getName());
        System.out.println("gender "+ emp.getGender());
        System.out.println("dept "+ emp.getDepartment());
        System.out.println("name "+ emp.getAge());
    }
//Who has the most working experience in the organization?

    public static void mostExpEmployee(){
        List<Employee> employeeList= getEmployeeList();
             Optional<Employee> seniorMostEmployeeWrapper=
               employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
    }


    // average salary of department
    public static void printAverageSalaryOfDept(){
        List<Employee> employeeList= getEmployeeList();
       Map<String,Double> avgSalary=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        avgSalary.forEach((k,v)->System.out.println(k+"--"+v));
    }
//count employee department wise
public static void countEmpDeptWise(){
    List<Employee> employeeList= getEmployeeList();
    Map<String, Long> map=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
    map.forEach((k,v)->System.out.println(k+""+v));
}
    // get the name of employee who has joined after 2015
public static void printEmployeeNameJoinedAfter2015(){
       List<Employee> employeeList= getEmployeeList();
      List<String >employeeName= employeeList.stream().filter(e->e.getYearOfJoining()>2015).map(Employee::getName).collect(Collectors.toList());
      employeeName.forEach(System.out::println);
}
 //what is average of male and female employee
public static void averageAge(){
    List<Employee> employeeList= getEmployeeList();
    Map<String,Double> employeeAge=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
    employeeAge.forEach((k,v)->System.out.println(k+"---"+v));
}
//get Highest paid employee
    public static Employee highestPaidEmployee(){
        List<Employee> employeeList= getEmployeeList();
        Optional<Employee> optionalEmployee=employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
       return optionalEmployee.get();

    }

    public static void printEmployee(Employee e){
        System.out.println("Emp name="+e.getName());
        System.out.println("Emp salary="+e.getSalary());
        System.out.println("Emp dept="+e.getDepartment());
        System.out.println("Emp age="+e.getAge());
    }
//How many male and female employees are there in the organization?
    public static void countMaleAndFemale(){
        List<Employee> employeeList= getEmployeeList();
        Map<String, Long> noOfMaleAndFemaleEmployees=
                employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println(noOfMaleAndFemaleEmployees);
    }

    //Print all department in organization

    public static void printDepartment(){
        List<Employee> employeeList= getEmployeeList();
        employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
    }

    public static  List<Employee> getEmployeeList(){
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
        return employeeList;
    }
}
