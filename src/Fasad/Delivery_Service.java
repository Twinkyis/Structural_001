package Fasad;

public class Delivery_Service {
    Courier_delivery courier_delivery = new Courier_delivery();
    Office_delivery office_delivery = new Office_delivery();
    CallCenter_delivery callCenter_delivery = new CallCenter_delivery();

    void copy(){
        office_delivery.workoff();
        callCenter_delivery.call_on();
        courier_delivery.C_delivery(office_delivery);}}
