package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car(200, "Ford", 2010));
        cars.add(new Car(250, "Ferrari", 2015));
        cars.add(new Car(190, "Renault", 2000));
        cars.add(new Car(230, "BMW", 2017));
        cars.add(new Car(205, "KIA", 2011));
    }

    @Override
    public List<Car> getCars(int number) {
        return cars.stream().limit(number).toList();
    }
}
