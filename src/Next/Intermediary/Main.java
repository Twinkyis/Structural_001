package Next.Intermediary;

public class Main {
    public static void main(String[] args) {

        Sys_direction boxc = new Sys_direction();

        Courier courier_pro = new Courier_1(boxc);
        Courier c_2 = new Courier_2(boxc);
        Courier c_3 = new Courier_1(boxc);

        boxc.setCourier_pro(courier_pro);
        boxc.addCourier(c_2);
        boxc.addCourier(c_3);

        c_2.getBox("booo");
        courier_pro.getBox(" get out");
    }
}
