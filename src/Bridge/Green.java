package Bridge;

public class Green extends Package {
    public Green (IBox b){super(b);}
    void showSize() {System.out.print("Green ");
        iBox.setSize();
    }
}
