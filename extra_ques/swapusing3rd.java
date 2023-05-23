import java.util.Scanner;

public class swapusing3rd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter 1st num : ");
    int a = sc.nextInt();
    
    System.out.println("Enter 2nd num : ");
    int b = sc.nextInt();

    int tmp = a;
    System.out.println("Before swap a is " + a + " and b is " + b);

    //swap
    a = b;
    b = tmp;

    System.out.println("After swap a is " + a + " and b is " + b);
  }
}
