/* Interface */
interface Printable {
    void printDetails();
}

/* Abstract class */
abstract class Person {
    String name;
    public Person(String n) {
        name = n;
    }
}

/* Inheritance */
class Student extends Person implements Printable {
    int rollNo;
    
    public Student(String n, int r) {
        super(n);
        rollNo = r;
    }
    
    public void printDetails() {
        System.out.println("Name: " + name + ", Roll: " + rollNo);
    }
}

/* Generic container */
class Record<T extends Printable> {
    T[] arr = (T[]) new Printable[10];
    int count = 0;

    public void add(T obj) {
        try {
            arr[count] = obj;
            count++;
        } catch (Exception e) {
            System.out.println("Array is full");
        }
    }

    public void showAll() {
        for (int i = 0; i < count; i++) {
            arr[i].printDetails();
        }
    }
}

public class Prac10 {
    public static void main(String[] args) {
        Record<Student> rec = new Record<Student>();
        
        Student s1 = new Student("Aman", 101);
        Student s2 = new Student("Rohit", 102);
        
        rec.add(s1);
        rec.add(s2);
        
        System.out.println("Student Records:");
        rec.showAll();
    }
}
