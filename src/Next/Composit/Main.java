package Next.Composit;

public class Main {
    public static void main(String[] args) {
        IiBox box1 = new Box_1();
        IiBox box2 = new Box_2();

        IiBox box3 = new Box_3();
        IiBox box4 = new Box_4();

        Factory_Composite_Box composite = new Factory_Composite_Box();
        Factory_Composite_Box composite1 = new Factory_Composite_Box();
        Factory_Composite_Box composite2 = new Factory_Composite_Box();

        composite1.addBox(box1);
        composite1.addBox(box2);

        composite2.addBox(box3);
        composite2.addBox(box4);

        composite.addBox(composite1);
        composite.addBox(composite2);

        composite.Name();
    }
}
