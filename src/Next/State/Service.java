package Next.State;

public class Service {
    IBox iBox;
    void setIBox(IBox bx){iBox = bx;}
    void nextIBox(){
        if (iBox instanceof Box_A){
            setIBox(new Box_B());
        }
        else if (iBox instanceof Box_B){
            setIBox(new Box_A());
        }
    }
    void play(){
        iBox.load();
    }
}
