package challenges;

import domain.Car;
import domain.Student;

import java.io.StringReader;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.Comparator;

import static java.util.stream.Nodes.collect;


public class CarOps {

//40
    public static List<String> filterCarsByMakeAndModel(List<Car> cars) {
        return cars.stream()
                .map(car -> car.getMake() + " " +  car.getModel())
                .collect(Collectors.toList());
    }
//41
    public static Optional<Car> findFirstCar(List<Car> cars){
        return cars.stream().findFirst();
    }

    //42
    public static Optional<Car> findAnyCar(List<Car> cars){
        return cars.stream().findAny();
    }

    //44


}
