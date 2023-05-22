import java.util.Scanner;

public class reversenum {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number : ");
    int a = sc.nextInt();

    int tmp;
    int rev = 0;

    while(a != 0){
      tmp = a % 10;
      rev = rev * 10 + tmp;
      a = a / 10;
    }

    System.out.println("Rev number is : " + rev);

  }
}
