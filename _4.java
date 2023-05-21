/*
    A Company manufactures Vehicles, which could be a Helicopter, a Car, or a Train depending on the customer’s
    demand. Each Vehicle instance has a method called move, which prints on the console the nature of movement
    of the vehicle. For example, the Helicopter Flies in Air, the Car Drives on Road and the Train Runs on Track.
    Write a program that accepts input from the user on the kind of vehicle the user wants to order, and the
    system should print out nature of movement. Implement all Java coding best practices to implement this program.


*/

import java.util.Scanner;

class Vehicle{
    public void move(){}
}

class Helicopter extends Vehicle{
    @Override
    public void move(){
        System.out.println("Helicopter flies in the air.");
    }
}

class Train extends Vehicle{
    @Override
    public void move() {
        System.out.println("A train runs on tracks.");
    }
}

class Car extends Vehicle{
    @Override
    public void move(){
        System.out.println("A car drives on road.");
    }
}

public class _4 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Helicopter");
        System.out.println("2. Train");
        System.out.println("3. Car\n");
        System.out.println("Choose a vehicle from above: ");

        switch (sc.nextInt()){
            case 1:
                Vehicle heli = new Helicopter();
                heli.move();
                break;

            case 2:
                Vehicle train = new Train();
                train.move();
                break;

            case 3:
                Vehicle car = new Car();
                car.move();
                break;

            default:
                System.out.println("Invalid Input!");
                break;
        }

    }


}
