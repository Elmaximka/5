package web.service;

import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    @Override
    public List<Car> getAllCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Lambo", 1215, 1_000_000_000));
        cars.add(new Car("Bugatti", 15484, 2_000_000_000));
        cars.add(new Car("Lada", 1584, 1));
        cars.add(new Car("Ducatti", 156548, 9849887));
        return cars;
    }
}
