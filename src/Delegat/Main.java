package Delegat;

public class Main {
    public static void main(String[] args) {

        Courier courier = new Courier();
        courier.setiBox(new BigBox());
        courier.packing();
    }
}
