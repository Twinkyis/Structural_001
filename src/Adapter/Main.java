package Adapter;

public class Main {
    public static void main(String[] args) {

        Adapter copyFile = new Lighting_to_TypeC(new Iphone());
        copyFile.connect();


    }
}
