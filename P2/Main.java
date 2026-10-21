// Base class
class Person {
    protected String name;
    protected int age;

    // Base class constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + " | Age: " + age);
    }
}

// Single Inheritance: Student inherits from Person
class Student extends Person {
    private int rollNumber;
    private String course;

    public Student(String name, int age, int rollNumber, String course) {
        super(name, age); // Constructor chaining using super
        this.rollNumber = rollNumber;
        this.course = course;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Method reuse from base class
        System.out.println("Roll No: " + rollNumber + " | Course: " + course);
    }
}

// Intermediate class for Multilevel Inheritance
class Employee extends Person {
    protected int empId;
    protected double salary;

    public Employee(String name, int age, int empId, double salary) {
        super(name, age);
        this.empId = empId;
        this.salary = salary;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Emp ID: " + empId + " | Salary: $" + salary);
    }
}

// Multilevel Inheritance: Faculty inherits from Employee, which inherits from Person
class Faculty extends Employee {
    private String department;
    private String specialization;

    public Faculty(String name, int age, int empId, double salary, String department, String specialization) {
        super(name, age, empId, salary); // Chains up to Employee and Person
        this.department = department;
        this.specialization = specialization;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Reuses Employee's displayInfo
        System.out.println("Department: " + department + " | Specialization: " + specialization);
    }
}

// Main execution class
public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("=== Single Inheritance Test ===");
        Student student = new Student("Alice", 20, 101, "Computer Science");
        student.displayInfo();

        System.out.println("\n=== Multilevel Inheritance Test ===");
        Faculty faculty = new Faculty("Dr. Smith", 45, 501, 75000.0, "Computer Science", "Artificial Intelligence");
        faculty.displayInfo();
    }
}
