package Delegat;

public class Courier {

    IBox iBox;

    void setiBox(IBox box){
        iBox = box;
    }

    void packing(){
        iBox.packing();
    }
}
