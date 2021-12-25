package Next.Chain;

public class Main {
    public static void main(String[] args) {
       Box_Logger g = new Box_Logger(Class_Box.medium);
       g.setClassBox("Принять на погрузку ящики небольшого размера", Class_Box.small);
       g.setClassBox("Принять все ящики", Class_Box.big);

    }
}
