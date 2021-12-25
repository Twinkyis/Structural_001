package Next.Observer;

import java.util.ArrayList;
import java.util.List;

public class Box implements IBox{
        int Size;
        int Num;

        public void setF (int size, int num){
            Size = size;
            Num = num;
            notifycouriers();
        }

        List<ICourier> couriers = new ArrayList<>();

    public void addcourier(ICourier x) {
        couriers.add(x);
    }

    public void removecourier(ICourier x) {
        couriers.remove(x);
    }

    public void notifycouriers() {
        for (ICourier x: couriers){
            x.observe(Num, Size);
        }
    }
    }
