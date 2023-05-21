import java.util.Scanner;

//3.1Java Program to Reverse a String.
//3.2) Write a Java program to check that String is palindrome or not.
public class _3 {
    public static void reverse(String st){//3.1
        StringBuilder SB = new StringBuilder(st);
        System.out.println(SB.reverse());
    }
    public static void checkpallindrome(String st){//3.2
        StringBuilder SB = new StringBuilder(st);
        System.out.println(st.equals(SB.reverse().toString()));
    }

    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter String");
        String word = new String(sc.next());
        reverse(word);
        checkpallindrome(word);

    }
}
