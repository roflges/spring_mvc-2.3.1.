package web.dao;


import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDao {
    public static List<Car> listCar;

    {
        listCar = new ArrayList<>();
        listCar.add(new Car("1970 Dodge Charger", "black", "Dominic Toretto"));
        listCar.add(new Car("Nissan Skylyne GT-R34", "grey", "Bryan O'Conner"));
        listCar.add(new Car("DeLorean DMC-12", "grey", "Marty McFly"));
        listCar.add(new Car("Peugeot 407", "white", "Daniel Morales"));
        listCar.add(new Car("Chevrolet Impala 1967", "black", "Dean Winchester"));
    }

    public List<Car> numberOfCars(List<Car> cars, int number) {
        if (number == 0 || number > 5) return cars;
        return cars.stream().limit(number).collect(Collectors.toList());
    }

}