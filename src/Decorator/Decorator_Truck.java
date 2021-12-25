package Decorator;

public class Decorator_Truck implements Delivery{
    Delivery pack;
    public Decorator_Truck (Delivery pack) {this.pack = pack;}
    public void delivery(){
        pack.delivery();
        System.out.println("Truck");
    }
}
