import java.util.*;

class Car{
    int gear;
    String engine;
 
    Car(){
        System.out.println("car constructor");
    }

    Car(int gear){
        this.gear = gear;
    }
    
    Car(int gear, String engine){
        this.gear = gear;
        this.engine = engine;
    }
    
    public void drive(){
        System.out.println("car is running");
    }
}

class FlyingCar extends Car{
    String wings;
    int gear;
    
    
    FlyingCar(){
        super(5,"Patrol"); 
        System.out.println("Flying constructor");
    }
    
    FlyingCar(String wings){
        this.wings = wings;
    }
    
    FlyingCar(int gear , String engine , String wings){
        super(gear,engine); 
        this.wings = wings;
    }
    
    void display(){
        System.out.println(this.wings + " " + super.gear + " " + super.engine);
        super.drive();
    }

    // public void drive(){
    //     System.out.println("car is flying");
    // }
}

class HydroCar extends FlyingCar{
    String pedal;
    void display(){
        System.out.println(this.wings + " " + super.gear + " " + super.engine);
        super.drive();
}
}

public class oops2{
    public static void main(String args[]){
        //referance  //object
 //         ^           ^
 //         |           |
        // Car a = new Car();
        // a.drive();

        // FlyingCar b = new FlyingCar();
        // b.drive();
        
        Car c = new FlyingCar(); //In this example we have car referance and flyingcar object
        // so we can only access car properties and couldn't able to access wings of flyingCar
        // but still our c.drive() will  give output of flyingcar drive = car is flying
        c.drive(); // so this is run time polymorphism //overriding of drive
        // if we remove drive() from parent class i.e Car then this will not run irrespective of 
        // the fact that we have drive() in our flyingCar.
        //but if our child have no drive but parent has then its parent drive will run.


        //this is not possible , constructor of flying car was never called.
        // FlyingCar d = new Car(); //Car cannot be converted to FlyingCar
        // d.drive();
    }
}

