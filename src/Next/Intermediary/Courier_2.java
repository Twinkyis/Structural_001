package Next.Intermediary;

public class Courier_2 implements  Courier {
    IBox iBox;
    public Courier_2(IBox iBox){ this.iBox = iBox;}

    public void setBox(String box) { iBox.setBox(box, this);}


    @Override
    public void getBox(String box) {
        System.out.println("курьер_2 получил коробку'" + box + "'");}}
