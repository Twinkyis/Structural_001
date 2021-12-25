package Next.Flyweght;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    private static final Map<String, Car> cars = new HashMap<>();
    public Car getCar(String carname){

        Car car = cars.get(carname);
        if (car==null){
            switch (carname){
                case "type_1":
                car = new type_1();
                break;
                case  "type_2":
                    car = new type_2();
                    break;
                case "type_3":
                    car = new type_3();
                    break;
            }
        }
        return car;
    }

}
