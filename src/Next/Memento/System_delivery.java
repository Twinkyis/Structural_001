package Next.Memento;

public class System_delivery {

    private String Name;
    private int NumDay;
    public void set(String Name, int NumPhone){
        this.Name = Name;
        this.NumDay = NumPhone;
    }
    public void load(Save save){
        Name = save.getName();
        NumDay = save.getNumDay();
    }
    public Save save(){
        return new Save(Name, NumDay);
    }

    public String toString (){
        return "System_delivery [name=" + Name + ", NumDay=" + NumDay + "]";
    }
}
