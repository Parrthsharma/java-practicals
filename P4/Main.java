
interface Payable {
    void processPayment();
}

interface Printable {
    void printDetails();
}

abstract class Employee {
    protected String name;
    protected int id;
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }


    public abstract double calculateSalary();

    public void displayBaseInfo() {
        System.out.println("ID: " + id + " | Name: " + name);
    }
}
class FullTimeEmployee extends Employee implements Payable, Printable {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing monthly direct deposit of $" + calculateSalary() + " for " + name);
    }

    @Override
    public void printDetails() {
        System.out.println("[Printable Record] Full-Time Employee -> ID: " + id + ", Name: " + name + ", Monthly Salary: $" + calculateSalary());
    }
}

class PartTimeEmployee extends Employee implements Payable, Printable {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing hourly wage check of $" + calculateSalary() + " for " + name);
    }

    @Override
    public void printDetails() {
        System.out.println("[Printable Record] Part-Time Employee -> ID: " + id + ", Name: " + name + ", Total Wages: $" + calculateSalary());
    }
}

// Main execution class
public class AbstractionDemo {
    public static void main(String[] args) {
        System.out.println("=== Testing Abstraction and Multiple Interfaces ===");

        // Creating Full-Time Employee
        Employee ftEmployee = new FullTimeEmployee("Alice", 101, 4500.0);
        ftEmployee.displayBaseInfo();
        ((Payable) ftEmployee).processPayment();
        ((Printable) ftEmployee).printDetails();

        System.out.println();

        // Creating Part-Time Employee
        Employee ptEmployee = new PartTimeEmployee("Bob", 102, 20.0, 75);
        ptEmployee.displayBaseInfo();
        ((Payable) ptEmployee).processPayment();
        ((Printable) ptEmployee).printDetails();
    }
}
