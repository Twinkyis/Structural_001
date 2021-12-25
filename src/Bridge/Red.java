package Bridge;

public class Red extends Package {
    public Red (IBox b){super(b);}
    void showSize() {System.out.print("Red ");
        iBox.setSize();
    }
}
