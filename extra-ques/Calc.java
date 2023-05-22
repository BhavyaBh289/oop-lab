import java.util.*;



public class Calc {
  public int add(int a, int b){
    return a + b;
  }

  public int mul(int a, int b){
    return a * b;
  }
  //add the rest on your own.

  public static void main(String[] args) {
    Calc obj = new Calc();

    System.out.println(" Add is : " + obj.add(1, 2));
  }
}
