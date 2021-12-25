package Decorator;

public class Decorator_Bike implements Delivery{
    Delivery pack;
    public Decorator_Bike (Delivery pack) {this.pack = pack;}
    public void delivery(){
        pack.delivery();
        System.out.println("Bike");
    }
}
