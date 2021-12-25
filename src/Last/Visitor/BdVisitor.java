package Last.Visitor;

public class BdVisitor implements Visitor{
    @Override
    public void visit(EngineElement engine) {
        System.out.println("222");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("223");
    }
}
