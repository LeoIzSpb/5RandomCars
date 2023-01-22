package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class CarDao {

    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(1, "LADA",2010));
        cars.add(new Car(2, "BMW", 7));
        cars.add(new Car(3, "Suzuki",1996));
        cars.add(new Car(4, "ZIL",1945));
        cars.add(new Car(5, "HAVEL",2215));

    }

    public List<Car> index(int count) {
        List<Car> cars1 = new ArrayList<>();
        Random random = new Random();

        for ( int i = 0 ; i<count&& i<5 ;i++ ) {
            cars1.add(cars.get(random.nextInt(5)));
        }
        return cars1;
    }
}
