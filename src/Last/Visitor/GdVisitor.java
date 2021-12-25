package Last.Visitor;

public class GdVisitor implements Visitor{
    @Override
    public void visit(EngineElement engine) {
        System.out.println("111");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("112");
    }
}
