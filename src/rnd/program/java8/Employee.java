package rnd.program.java8;

public class Employee {
    private int empNo;
    private String deptName;
    private double salary;

    public Employee(int empNo, String deptName, double salary) {
        this.empNo = empNo;
        this.deptName = deptName;
        this.salary = salary;
    }

    public int getEmpNo() {
        return empNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public double getSalary() {
        return salary;
    }
}
