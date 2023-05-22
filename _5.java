//We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects (each out of
//100) by student B. Create an abstract class ‘Marks’ with an abstract method ‘getPercentage’. It is inherited by two other classes ‘A’ and ‘B’
//each having a method with the same name which returns the percentage of the students. The constructor of student A takes the marks in
//three subjects as its parameters and the marks in four subjects as its parameters for student B. Create an object for eac of the two classes
//and print the percentage of marks for both the students.


import java.util.Scanner;

public class _5 {
    public static void main (String [] args ){
        A a = new A(90, 90, 90);
        double aMarks = a.getPercentage();
        B b = new B(10, 10, 10, 20);
        double bMarks = b.getPercentage();
        System.out.println(aMarks + " " + bMarks);

    }
}
abstract class marks{
    abstract int getPercentage();
}
class A extends marks{
    int marks1,marks2,marks3;
    public A (int marks1,int marks2,int marks3){
        this.marks1= marks1;
        this.marks2= marks2;
        this.marks3= marks3;
    }
    @Override
    int getPercentage() {
        return (marks1+marks2+marks3)/3;
    }
}
class B extends marks{
    int marks1,marks2,marks3,marks4;
    public B (int marks1,int marks2,int marks3,int marks4){
        this.marks1= marks1;
        this.marks2= marks2;
        this.marks3= marks3;
        this.marks4 = marks4;
    }
    @Override
    int getPercentage() {
        return (marks1+marks2+marks3+marks4)/4;
    }
}