import java.util.ArrayList;
import java.util.List;
class Course {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }
    public String getCourseName() {
        return courseName;
    }
}
class Student {
    private String name;
    private List<Course> courses; // Association (Many-to-Many / Many-to-One)

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }
    public void enrollCourse(Course course) {
        courses.add(course);
    }
    public void displayStudentInfo() {
        System.out.println("Student: " + name);
        System.out.print("Enrolled Courses: ");
        for (Course c : courses) {
            System.out.print("[" + c.getCourseName() + "] ");
        }
        System.out.println("\n");
    }
}
class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class Department {
    private String deptName;
    private List<Teacher> teachers; // Aggregation (Has-A relationship)

    public Department(String deptName, List<Teacher> teachers) {
        this.deptName = deptName;
        this.teachers = teachers;
    }
    public void displayDepartmentInfo() {
        System.out.println("Department: "  + deptName);
        System.out.println("Faculties:");
        for (Teacher t : teachers) {
            System.out.println(" - " + t.getName());
        }
        System.out.println();
    }
}
class College {
    String collegeName;
    private List<Department> departments; // Composition (Strong ownership)

    public College(String collegeName) {
        this.collegeName = collegeName;
        this.departments = new ArrayList<>();
    }
    public void addDepartment(String deptName, List<Teacher> teachers) {
        Department dept = new Department(deptName, teachers);
        departments.add(dept);
    }
    public void displayCollegeInfo() {
        System.out.println("=== College: " + collegeName + " ===");
        for (Department d : departments) {
            d.displayDepartmentInfo();
        }
    }
}
public class RelationshipsDemo {
    public static void main(String[] args) {
        System.out.println("=== 1. Association Demo ===");
        Course c1 = new Course("Data Structures");
        Course c2 = new Course("Operating Systems");

        Student s1 = new Student("Aarav Sharma");
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s1.displayStudentInfo();

        System.out.println("=== 2. Aggregation Demo (Teachers exist independently) ===");
        Teacher t1 = new Teacher("Dr. Ramesh Kumar");
        Teacher t2 = new Teacher("Dr. Sneha Gupta");

        List<Teacher> csTeachers = new ArrayList<>();
        csTeachers.add(t1);
        csTeachers.add(t2);

        System.out.println("Teacher " + t1.getName() + " exists outside the department.");

        System.out.println("\n=== 3. Composition Demo (College owns Departments) ===");
        College college = new College("Delhi Institute of Technology");
        college.addDepartment("Computer Science", csTeachers);
        
        college.displayCollegeInfo();
    }
}
