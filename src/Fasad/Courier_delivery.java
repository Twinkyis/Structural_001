package Fasad;

public class Courier_delivery {
void C_delivery(Office_delivery office){
    if(office.haswork()){
        System.out.println("Dostavka v puty");
    }
    else {
        System.out.println("dostavka nevozmojna");
    }
}
}
