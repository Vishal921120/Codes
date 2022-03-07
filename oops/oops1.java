import java.util.*;

class Car{
    int gear;
    String engine;
    
    //constructor 
    Car(){
        System.out.println("car constructor");
    }
    
    //parametirsed constructor
    Car(int gear){
        this.gear = gear;
    }
    
    //constructor overloading -> Same name but different no of parameters and differnt order of types of parameter
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
        //super is used to call parent constructor while this() is used to call its own constructor
        // cannot write printlnStatement before super and this
        //this("plastic"); //call to super must be first statement in constructor
        super(5,"Patrol");  // call to this must be first statement in constructor
        // so we can wrtie either this or super not both
        System.out.println("Flying constructor");
    }
    
    FlyingCar(String wings){
        this.wings = wings;
    }
    
    FlyingCar(int gear , String engine , String wings){
        super(gear,engine); // sending to parent cosntructor
        this.wings = wings;
    }
    
    void display(){
        //super. is used to get data from parent 
        // as flyingcar also have gear property , for getting that we can write it without super
        System.out.println(this.wings + " " + super.gear + " " + super.engine);
        // drive(); we can write it without super but it will take time to find because first it will find drive in flyingcar
        // then it will find in its parent class so to reduce this time we can use super
        super.drive();
    }

    public void drive(){
        System.out.println("Flyingcar is running");
    }
}

class HydroCar extends FlyingCar{
    String pedal;
    void display(){
        System.out.println(this.wings + " " + super.gear + " " + super.engine);
        super.drive(); //only goes to its immediate parent 
        // We have drive fucntion in both flying car and car but super.drive returns only its current 
        // parent drive value ;
        // similarly this.wings returned null as this class has no wings , super.gear returned 0 and 
        //super.engine retured petrol
    }
}

//multiple inheritance is not possible in java
// class Xcar extends FlyingCar,HydroCar{
//     //code
// }

public class oops1{
    public static void main(String args[]){
        FlyingCar a = new FlyingCar(5,"CNG","iron");
        System.out.println(a.engine + " has " + a.wings + " wings.");
        a.display();

        HydroCar b = new HydroCar();
        b.display();

        Car c = new Car();
        // System.out.println(c.wings); //object cannot access its child properties
        //it can only use its own and its parent propeties
    }
}