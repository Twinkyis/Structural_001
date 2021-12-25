package Bridge;

public abstract class Package {
    IBox iBox;
    public Package (IBox b){iBox = b;}
    abstract void showSize();
}
