//package OOPs.Inheritance;

public class Employee {
    int empId;
    String empName;
    String empDept;

    Employee(int empId, String empName, String empDept){
        this.empId = empId;
        this.empName = empName;
        this.empDept = empDept;
    }
}

class Manager extends Employee{
    double salary;
    String designation;

    Manager(int empId, String empName, String empDept, double salary, String designation){
        super(empId, empName, empDept);
        this.salary = salary;
        this.designation = designation;
    }

    public void displayInfo(){
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Department: " + empDept);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
    }
}

class Main {
    public static void main(String[] args) {
        Manager manager = new Manager(101, "Manthan", "HR", 75000.0, "HR Manager");
        manager.displayInfo();
    }
}
