package Next.Composit;

import java.util.ArrayList;
import java.util.List;


class Factory_Composite_Box implements IiBox{
    private List<IiBox> components = new ArrayList<>();

    public void addBox (IiBox component){
        components.add(component);
    }
    public void RemoveBox (IiBox component){
        components.remove(component);
    }
    public void Name(){
        for (IiBox components: components) {
            components.Name();}}
}
