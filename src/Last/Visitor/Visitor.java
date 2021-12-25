package Last.Visitor;

public interface Visitor {
    void visit (EngineElement engine);
    void visit (BodyElement body);
}
