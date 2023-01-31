package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


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

    public List<Car> getCarsByCount(int count) {
        return cars.subList(0,(Math.min(count, 5)));
    }
}
