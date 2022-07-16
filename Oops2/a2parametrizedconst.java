public class a2parametrizedconst {
    public static class Phone{
        String companyName;
        String model ;
        String color;
        int ram;
        int storage ;
        int batteryPower;

        Phone(){ 

            // When we define our own constructor then we lost our default constructor.
            // Created this for p1 and p2 otherwise the code will not run;

        }

        Phone(String companyName,String model,String color, int ram,int storage, int batteryPower){
            this.companyName = companyName;
            this.model = model;
            this.color = color;
            this.ram = ram ;
            this.storage = storage;
            this.batteryPower = batteryPower;
        }

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

        // Above lines can be written in the single line by using our parametrized constructor
        Phone p3 =  new Phone("vivo","ff", "vilot", 10, 556, 5500);

        p1.getInfo();
        System.out.println("-------------------------------------------");
        p2.getInfo();
        System.out.println("-------------------------------------------");
        p3.getInfo();
    }

    public static void main(String[] args){
        test1();
    }
}
