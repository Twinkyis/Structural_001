package Decorator;

public class Main {
    public static void main(String[] args) {
        Delivery c =  new Decorator_Car( new Airplane("load to Airplane"));
        c.delivery();
    }
}
