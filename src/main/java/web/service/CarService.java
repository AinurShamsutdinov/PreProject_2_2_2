package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    List<Car> carList = new ArrayList<>();

    public List<Car> getCarList() {
        carList.add(new Car("Gazon", 1500, 160));
        carList.add(new Car("Granta", 700, 160));
        carList.add(new Car("Maybach", 1000, 250));
        return carList;
    }
}
