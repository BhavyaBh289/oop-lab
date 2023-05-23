class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Student1 {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student1(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        this.rollNo = rollNo;
        validateName(name);
        validateAge(age);
        this.age = age;
        this.course = course;
    }

    private void validateAge(int age) throws AgeNotWithinRangeException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age is not within the range of 15 to 21");
        }
    }

    private void validateName(String name) throws NameNotValidException {
        if (name.matches(".*\\d.*") || name.matches(".*[^a-zA-Z\\s].*")) {
            throw new NameNotValidException("Name contains numbers or special symbols");
        }
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }
}

public class _24 {
    public static void main(String[] args) {
        try {
            Student1 student1 = new Student1(1, "John Doe", 18, "Math");
            System.out.println("Student 1:");
            System.out.println("Roll No: " + student1.getRollNo());
            System.out.println("Name: " + student1.getName());
            System.out.println("Age: " + student1.getAge());
            System.out.println("Course: " + student1.getCourse());
            System.out.println();

            // Testing invalid age
            Student1 student2 = new Student1(2, "Jane Smith", 14, "Science");
            System.out.println("Student 2:");
            System.out.println("Roll No: " + student2.getRollNo());
            System.out.println("Name: " + student2.getName());
            System.out.println("Age: " + student2.getAge());
            System.out.println("Course: " + student2.getCourse());
            System.out.println();
        } catch (AgeNotWithinRangeException e) {
            System.out.println("AgeNotWithinRangeException: " + e.getMessage());
        } catch (NameNotValidException e) {
            System.out.println("NameNotValidException: " + e.getMessage());
        }
    }
}
