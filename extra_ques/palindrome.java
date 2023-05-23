import java.util.Scanner;

public class palindrome {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a number : ");
    int num = sc.nextInt();
    int pal = 0;
    int check = num;

    while(num != 0){
      pal = pal * 10 + (num % 10);
      num /= 10;
    }

    System.out.println(pal);

    if(check == pal){
      System.out.println("Palindrome int");
    }else{
      System.out.println("Not Palindrome");
    }


    sc.close();
  }
}
