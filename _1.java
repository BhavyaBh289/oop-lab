import java.util.Scanner;

public class _1 {
    public static void main (String [] args ){
        Scanner sc = new Scanner(System.in);
        int []  array = new int[sc.nextInt()];
        for (int i=0; i<array.length;i++){
            array[i]= sc.nextInt();
        }
        for (int i=0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
