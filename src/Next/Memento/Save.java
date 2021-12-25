package Next.Memento;

public class Save {
    private final String Name;
    private final int NumDay;
    public Save(String Name, int NumDay){
        this.Name = Name;
        this.NumDay = NumDay;
    }
    public int getNumDay() {
        return NumDay;
    }
    public String getName() {
        return Name;
    }
}
