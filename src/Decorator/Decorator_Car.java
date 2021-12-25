package Decorator;

public class Decorator_Car implements Delivery {
    Delivery pack;
        public Decorator_Car (Delivery pack) {this.pack = pack;}
        public void delivery(){
            pack.delivery();
            System.out.println("Car");
        }
}
