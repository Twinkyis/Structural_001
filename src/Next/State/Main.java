package Next.State;

public class Main {
    public static void main(String[] args) {

    IBox x = new Box_A();
    Service service = new Service();
    service.setIBox(x);
    service.play();
    service.nextIBox();
    service.play();

    }
}
