import java.util.Date;

public class Main {
    public static void main(String[] args) {
       // Vehicle vh=new Vehicle("Toyota","Corolla", "2017-01-01","diesel");
        Car cr=new Car("Toyota","Corolla", "2017-01-01","diesel");
        System.out.println(cr.getFueltype());
        System.out.println(cr.getMaxSpeed());
    }
}