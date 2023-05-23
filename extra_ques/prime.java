import java.util.Scanner;

public class prime {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter num : ");
    int a = sc.nextInt();
    boolean flag = false;

    for(int i=2; i<a; i++){
      if(a%i == 0){
        flag = true;
        break;
      }
    }

    if(flag){
      System.out.println("Not prime");
    }else{
      System.out.println("Prime");
    }

    sc.close();
  }
}
