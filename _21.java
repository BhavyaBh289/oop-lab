import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int grade;
    private List<String> courses;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public void addCourse(String course) {
        courses.add(course);
        System.out.println("Course added: " + course);
    }

    public void removeCourse(String course) {
        if (courses.contains(course)) {
            courses.remove(course);
            System.out.println("Course removed: " + course);
        } else {
            System.out.println("Course not found: " + course);
        }
    }

    public void displayCourses() {
        System.out.println("Courses for " + name + ":");
        for (String course : courses) {
            System.out.println(course);
        }
    }
}

public class _21 {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 10);
        student.addCourse("Math");
        student.addCourse("Science");
        student.addCourse("History");

        student.displayCourses();

        student.removeCourse("Science");
        student.removeCourse("English");

        student.displayCourses();
    }
}
