import java.util.Scanner;

public class swapwith2num {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1st num : ");
    int a = sc.nextInt();
    
    System.out.println("Enter 2nd num : ");
    int b = sc.nextInt();

    System.out.println("Before swap a is " + a + " and b is " + b);
    
    a = b - a;
    b = b - a;
    a = a + b;
  
    System.out.println("After swap a is " + a + " and b is " + b);
    sc.close();

  }
}
