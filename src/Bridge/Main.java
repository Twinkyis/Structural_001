package Bridge;

public class Main {
    public static void main(String[] args) {

        Package p = new Green(new SmallBox());
        p.showSize();
    }
}
