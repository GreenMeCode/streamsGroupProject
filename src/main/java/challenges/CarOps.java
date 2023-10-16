package challenges;

import domain.Car;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;




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

    public static Map<Boolean, List<Car>> partitionByPrice(List<Car> cars, double price){
        return cars.stream()
                .collect(Collectors.partitioningBy(car -> car.getPrice() > price));
        
    }

//45




}
