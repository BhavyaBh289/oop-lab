import java.util.*;

public class constructor {

  //without paramaters
  public constructor(){
    System.out.println("wihtout parameter");
  }

  //with paramater
  public constructor(int num){
    System.out.println(num);
  }

  //different data type
  public constructor(float num){
    System.out.println(num);
  }
  
  //multiple paramater
  public constructor(int num, String name){
    System.out.println("Number = " + num + " and name : " + name);
    
  }
  
  public static void main(String[] args) {
    
    constructor obj = new constructor(); 
    constructor obj1 = new constructor(3);
    constructor obj3 = new constructor(3.4f);
    constructor obj4 = new constructor(12, "Suiiiiiiii");

  }
}
