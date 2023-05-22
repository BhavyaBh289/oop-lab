import java.util.Scanner;

public class sumdigits {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a number : ");
    int a = sc.nextInt();

    int tmp;
    int ans = 0;

    while(a != 0){
      tmp = a % 10;
      ans += tmp;
      a = a / 10;
    }
    
    System.out.println("Sum digits : " + ans);
    sc.close();
  }
}
