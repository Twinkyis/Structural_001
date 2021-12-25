package Next.Flyweght;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Factory factory = new Factory();
        List<Car> cars = new ArrayList<>();

        cars.add(factory.getCar("type_1"));
        cars.add(factory.getCar("type_2"));
        cars.add(factory.getCar("type_2"));
        cars.add(factory.getCar("type_3"));
        cars.add(factory.getCar("type_3"));
        cars.add(factory.getCar("type_1"));

        Random rand = new Random();
        for (Car car : cars){

            int d = rand.nextInt(44);
            int z = rand.nextInt(44);
                       car.tires(d, z);
        }


    }
}
