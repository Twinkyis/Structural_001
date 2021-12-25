package Next.Intermediary;

import java.util.ArrayList;
import java.util.List;

public class Sys_direction implements  IBox{
        Courier courier_pro;
        List<Courier> couriers = new ArrayList<>();

        public void setCourier_pro(Courier courier_pro){
            this.courier_pro = courier_pro;
        }
        public void addCourier (Courier c){
            couriers.add(c);
        }

        public void setBox (String box, Courier courier){
            for (Courier c : couriers){
                c.setBox(box);
            }
            courier_pro.getBox(box);
        }
     }
