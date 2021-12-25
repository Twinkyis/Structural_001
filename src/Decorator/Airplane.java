package Decorator;

public class Airplane implements Delivery{
    String value;
    public Airplane (String value){
        this.value = value;}
        public void delivery(){
        System.out.println(value);
        }
}
