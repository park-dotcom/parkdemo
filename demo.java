 class car{
    String model;
    String carName;
    int manuYear;
    void drive(){
        System.out.println("the car is the "+model+" and the name of the car is "+carName);
        int currentYear=2024;
        System.out.println("the car is "+(currentYear-manuYear)+" old");
    }
}
public class demo{
    public static void main(String args[]) {
        System.out.println("hello world");
        car c1=new car();
        c1.model="alto";
        c1.carName="maruti";
        c1.manuYear=2017;
        c1.drive();
    }
}