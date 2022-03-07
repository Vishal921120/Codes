import java.util.*;

//parent
// abstract means only function prototype but no definition , such fn must be overrided
abstract class Queue{
    public abstract void addLast(int val); //no definition,no body ,means empty {},no code
    public abstract int removeFirst();
}

//child
class Deque extends Queue{
    public void addFirst(int val){
        System.out.println("add first is overrided / implemented");
    }

    public int removeLast(){
        System.out.println("remove last is overrided/implemented");
        return 0;
    }
    
    // for overrding the return type of child should be same as parent
    // as child is inhereting its parent then we should override all the 
    // abstract method of parent in child class
    @Override
    public void addLast(int val){
        System.out.println("add last is overrided/implemented");
    }

    @Override
    public int removeFirst(){
        System.out.println("remove first is overrided/implemented");
        return 0;
    }
}

// there should always be a single public class in given package
public class oops3{
    public static void main(String args[]){
        // Queue obj = new Queue(); // this is not possible bcz  Queue is abstract, cannot be instantiated/create object
        // Deque obj = new Queue(); // Queue is abstract; cannot be instantiated/create object
        Queue obj = new Deque(); //here queue is reference and deque is object
        // as queue has only two functions so we cannot call remaining 2 methods present in child
        //class that is deque
        obj.addLast(10);
        // obj.addFirst(10); // this is not possible

        //for accessing all four fucntion make refernce of deque and object of deque
        Deque obj1 = new Deque();
        obj1.addFirst(12); //now this is possible

    }
}
