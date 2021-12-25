package Fasad;

public class Office_delivery {
    private boolean work = true;
    public boolean haswork(){
        return work;
    }

    void workon(){
        System.out.println("firma_rabotaet");
        work = true;
    }

    void workoff(){
        System.out.println("Firma ne rabotaet");
        work = false;
    }
}
