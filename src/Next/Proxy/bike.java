package Next.Proxy;

public class bike implements Ibike{
        String bolid;
        public bike(String bolid){
            this.bolid = bolid;
            load();
        }

       void load(){
            System.out.println("Ехать в " + bolid);
        }
    public void drive() {
        System.out.println("Показать права полиции для " + bolid);
    }
}
