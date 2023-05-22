import java.util.Scanner;

public class armstrong {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a number : ");
    int a = sc.nextInt();

    int b = a;
    int tmp;
    int ans = 0;

    while(a != 0){
      tmp = a % 10;
      ans += tmp * tmp * tmp;
      a = a / 10;
    }

    if(ans == b){
      System.out.println("Armstrong");
    }else{
      System.out.println("Nope");
    }

    sc.close();
  }
}
