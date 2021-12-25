package Next.Proxy;

public class proxy_bike implements Ibike{
    String bolid;
    bike bikes;
    public proxy_bike(String bolid){
        this.bolid = bolid;
    }
    public void drive(){
        if (bikes == null){bikes = new bike(bolid);}
          bikes.drive();
    }
}
