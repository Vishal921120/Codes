import java.util.*;

//parent
interface Stack{
    //In interface you don't need to write abstract or public as they are by default present
    public abstract void addLast(int val);
     int removeLast(); // we can write it without abstract or public as they are by default present
}

//parent
interface Queue{
    public abstract void addLast(int val);
    public abstract int removeFirst();
}

//child
// In interface multiple inheretance is possible
class Deque implements Queue,Stack{
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
public class oops4{
    public static void main(String args[]){
        Stack obj = new Deque();
        obj.addLast(10);
    }
}
