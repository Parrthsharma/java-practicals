class Student {
    
    private String name;
    private int rollNumber;
    private double marks;

    public Student() {
        name = "Not Assigned";
        rollNumber = 0;
        marks = 0.0;
    }

    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        setMarks(marks); 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks! Setting to 0.");
            this.marks = 0.0;
        }
    }

    public void display() {
        System.out.println("Roll No: " + rollNumber + " | Name: " + name + " | Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {
      
        Student s1 = new Student();
        Student s2 = new Student("ugank", 101, 85.5);
        Student s3 = new Student("parth", 102, 105.0); 

        s1.display();
        s2.display();
        s3.display();
    }
}
