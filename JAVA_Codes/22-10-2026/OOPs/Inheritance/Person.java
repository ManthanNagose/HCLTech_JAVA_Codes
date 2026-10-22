//University Management System

public class Person {
    int age;
    String name;

    Person(int age, String name){
        this.age = age;
        this.name = name;
    }
}
class Student extends Person{
    int rollNo;
    String course;

    Student(int age, String name, int rollNo, String course){
        super(age, name);
        this.rollNo = rollNo;
        this.course = course;
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Course: " + course);
    }
}

class ResearchScholar extends Person{
    String researchArea;
    String supervisor;

    ResearchScholar(int age, String name, String researchArea, String supervisor){
        super(age, name);
        this.researchArea = researchArea;
        this.supervisor = supervisor;
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Research Area: " + researchArea);
        System.out.println("Supervisor: " + supervisor);
    }
}

class Main {
    public static void main(String[] args) {
        Student student = new Student(20, "Rounak", 101, "Computer Science");
        student.displayInfo();

        System.out.println();

        ResearchScholar scholar = new ResearchScholar(25, "Manthan", "Artificial Intelligence", "Dr. Sita");
        scholar.displayInfo();
    }
}