package Next.Observer;

public interface IBox {
    void addcourier(ICourier x);
    void removecourier(ICourier x);
    void notifycouriers();
}
