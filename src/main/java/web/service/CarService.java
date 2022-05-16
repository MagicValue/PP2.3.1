package web.service;

import web.config.Car;

import java.util.List;

public interface CarService {

    List<Car> getCarByCount(List<Car> cars, int count);


}
