//Why we need class 
// let say we want to store the details of a student Vishal
// Details can be : Name , class , roll no , section , father name 
// Now for every new student we have to create another new variables to store the information 
// So its a very bad method to store the details of every student again and again creating
// lot of varibales and data types . So to make it genric means for further uses we will make
// class of a student and use that class for every student by making objects.

// below example is to store the information about phones.

public class a1 {
    public static class Phone{
        String companyName;
        String model ;
        String color;
        int ram;
        int storage ;
        int batteryPower;

        public void getInfo(){
            StringBuilder sb = new StringBuilder();
            sb.append("Company Name: " + this.companyName + "\n");
            sb.append("Model: " + this.model + "\n");
            sb.append("Color: " + this.color + "\n");
            sb.append("Ram: " + this.ram + "Gb\n");
            sb.append("Storage: " + this.storage + "Gb\n");
            sb.append("Battery Power: " + this.batteryPower + "mAH\n");

            System.out.println(sb);
        }
    }

    public static void test1(){
        Phone p1 = new Phone();
        p1.companyName = "oppo";
        p1.model = "5g e";
        p1.color = "black";
        p1.ram = 5;
        p1.storage = 64;
        p1.batteryPower = 4500;

        Phone p2 = new Phone();
        p2.companyName = "oppo";
        p2.model = "5g e";
        p2.color = "black";
        p2.ram = 50;
        p2.storage = 64;
        p2.batteryPower = 4500;

        p1.getInfo();
        System.out.println("-------------------------------------------");
        p2.getInfo();
    }

    public static void main(String[] args){
        test1();
    }
}
