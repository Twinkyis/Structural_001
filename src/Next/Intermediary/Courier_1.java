package Next.Intermediary;

public class Courier_1 implements Courier {

    IBox iBox;
    public Courier_1(IBox iBox){ this.iBox = iBox;}

    public void setBox(String box) { iBox.setBox(box, this);}


    @Override
    public void getBox(String box) {
    System.out.println("курьер_1 получил коробку '" + box + "'");
    }
}
