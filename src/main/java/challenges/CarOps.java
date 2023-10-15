package challenges;

import domain.Car;
import domain.Student;

import java.util.List;

public class CarOps {

    public static List<Car> filterCarsByMakeAndModel(List<Car> cars, String make, String model) {
        return cars.stream()
                .filter(car -> (car.getMake() + car.getModel()).equalsIgnoreCase(make + model))
                .toList();
    }

    public static List<Car> filterCarsByMakeAndModel

}
