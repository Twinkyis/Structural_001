package Next.Memento;

public class Main {
    public static void main(String[] args) {

        System_delivery c = new System_delivery();
        c.set("project", 4734);
        System.out.println(c);

        Box x = new Box();
        x.setSave(c.save());

        c.set("project_R", 4443);
        System.out.println(c);

        System.out.println("loading.....");
        c.load(x.getSave());
        System.out.println(c);
    }
}
