import java.util.Scanner;

public class factorial{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a num : ");
    int a = sc.nextInt();
    int ans = 1;

    for(int i=a; i>1; i--){
      ans *= i;
    }

    System.out.println("Factorial : " + ans);
    sc.close();

  }
}
