class Employee {
    int emp_id ;
    char emp_name;
    int emp_sal;

    Employee(int emp_id, char emp_name, int emp_sal){
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_sal = emp_sal;
    }

    void display(){
        System.out.println("Id is : " + emp_id);
        System.out.println("Name : " + emp_name);
        System.out.println("Salary: " + emp_sal);
    }
}

public class Main{
    public static void main(String args[]){
        Employee emp1 = new Employee(202, 'A', 2000);
        
        emp1.display();
    }
}
