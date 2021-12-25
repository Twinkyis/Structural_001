package Adapter;

public class Lighting_to_TypeC implements Adapter {

   private Iphone iphone;

    public Lighting_to_TypeC(Iphone iphone){
        this.iphone = iphone;
    }

    public void connect(){
        this.iphone.ReservCopy_images();
    }
}
