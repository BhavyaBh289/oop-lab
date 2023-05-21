/*
    Write the following code in your editor below: A class named Arithmetic with a method named add that
    takes 2 integers as parameters and returns an integer denoting their sum. A class named Adder that
    inherits from a superclass named Arithmetic. The main method in the Tester class should print the
    following: SAMPLE O/P:My superclass is: Arithmetic 42 13 20
*/

class Arithematic{

    public int add(int num1, int num2){
        return num1+num2;
    }
}

class Adder extends Arithematic{

    public Adder(){
        System.out.println("My superclass is: Arithmetic");
    }

}

public class _6 {

    public static void main(String args[]){
        Arithematic obj = new Adder();
        System.out.println(obj.add(12, 30));

        System.out.println(obj.add(6, 7));

        System.out.println(obj.add(17, 3));
    }
}
