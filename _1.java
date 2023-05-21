import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// 1.1) Program to remove all repeated elements from an array
// 1.2) Write a Java program to find the common elements between two arrays of integers.
public class _1 {
    public static int removeDuplicate(int arr[]){// 1.1
        Arrays.sort(arr);//sorting array
        int n = arr.length;
        if (n==0 || n==1){
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++){
            if (arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1];
        // Changing original array
        for (int i=0; i<j; i++){
            arr[i] = temp[i];
        }
        return j;
    }
    public static void findcommon(int []arr1, int []arr2){
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {

                    // add common elements
                    set.add(arr1[i]);
                    break;
                }
            }
        }
        for (int i : set) {
            System.out.print(i + " ");
        }
    }
    public static void main (String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nlength of array ");
        int []  array = new int[sc.nextInt()];
        System.out.println("\nenter elements ");

        for (int i=0; i<array.length;i++){
            array[i]= sc.nextInt();
        }
        for (int i=0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        int l = removeDuplicate(array);
        System.out.println("\narray after removing duplicates are ");
        for (int i=0; i<l;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("\nlength of array 1");

        int []  array1 = new int[sc.nextInt()];
        System.out.println("\nenter elements ");

        for (int i=0; i<array1.length;i++){
            array1[i]= sc.nextInt();
        }
        System.out.println("\nlength of array 2 ");

        int []  array2 = new int[sc.nextInt()];
        System.out.println("\nenter elements ");

        for (int i=0; i<array2.length;i++){
            array2[i]= sc.nextInt();
        }
        findcommon(array1,array2);
    }
}
