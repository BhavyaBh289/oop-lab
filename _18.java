import java.util.Scanner;

class Person {
    protected String name;
    protected int age;

    public void acceptData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = scanner.nextLine();

        System.out.print("Enter age: ");
        age = scanner.nextInt();
    }
}

class Employee extends Person {
    private String designation;
    private double salary;

    public void acceptData() {
        super.acceptData();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter designation: ");
        designation = scanner.nextLine();

        System.out.print("Enter salary: ");
        salary = scanner.nextDouble();
    }

    public boolean hasSalaryGreaterThan(double amount) {
        return salary > amount;
    }

    public String getName() {
        return name;
    }
}

public class _18 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        System.out.println("Enter data for 5 persons:");

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Person " + (i + 1) + ":");
            employees[i] = new Employee();
            employees[i].acceptData();
        }

        System.out.println("\nEmployees with salary greater than 5000:");

        for (Employee employee : employees) {
            if (employee.hasSalaryGreaterThan(5000)) {
                System.out.println("Name: " + employee.getName());
            }
        }
    }
}
