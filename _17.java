import java.util.Arrays;
import java.util.Scanner;

public class _17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 strings:");
        String[] strings = new String[10];

        for (int i = 0; i < 10; i++) {
            strings[i] = scanner.nextLine();
        }

        // Sort the strings
        Arrays.sort(strings);

        System.out.println("Sorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }

        // Combine two strings
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        String combinedString = firstString.concat(secondString);
        System.out.println("Combined string: " + combinedString);

        // Reverse the first string
        String reversedString = reverseString(firstString);
        System.out.println("Reversed first string: " + reversedString);

        scanner.close();
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        reversed.reverse();
        return reversed.toString();
    }
}
