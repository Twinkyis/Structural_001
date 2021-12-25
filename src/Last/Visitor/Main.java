package Last.Visitor;

public class Main {
    public static void main(String[] args) {

        Element engine = new EngineElement();
        Element body = new BodyElement();

        Visitor c = new GdVisitor();
        engine.accept(c);
        body.accept(c);
    }
}
