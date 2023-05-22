import java.util.Scanner;

public class _12 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i<n;i++){
            for (int j = 0;j<=i-1;j++){
                System.out.print("**");
            }
            System.out.print("*\n");
        }
        for (int i = n; i>1;i--){
            for (int j = i;j>=3;j--){
                System.out.print("**");
            }
            System.out.print("*\n");
        }
    }
}
