// We have 5 types of constructor :- Default , paramertized , static , private ,copy 
// constructor has the same name as the class and it has no return type.
// When we don't give/ write constructor for our class then it has its default constructor with the same name of class

public class a2constructor {
    public static class Student {
        String name;
        int rollno;

        public String getInfo(){
            StringBuilder sb = new StringBuilder();
            sb.append("Name: " + this.name + "\n");
            sb.append("RollNo: " + this.rollno + "\n");

            return sb.toString();
        }
    }

    public static void test(){
        Student raj = new Student(); // Student() will initilize the default constructor as we don't have our own constructor
        System.out.println(raj.getInfo());
        // output 
        //Name: null // default value of string
        //RollNo: 0 // default value of int
        
    }

    public static void main(String[] args){
        test();
    }
}
