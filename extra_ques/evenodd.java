import java.util.Scanner;

public class evenodd {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a num : ");
    int a = sc.nextInt();
  
    if(a%2 == 0){
      System.out.println("Even\n");
    }else{
      System.out.println("Odd\n");
    }
    
    sc.close();
  }
}
