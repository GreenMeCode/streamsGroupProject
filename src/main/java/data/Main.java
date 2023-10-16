package data;

import domain.Car;
import domain.Student;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static challenges.CarOps.*;
import static data.FetchData.getCarList;

public class Main {
    public static void main(String[] args) throws IOException {
//        getCarList().stream()
//                .limit(5)
//                .forEach(System.out::println);
//        System.out.println("++++++++++++++++");
//        FetchData.getStudentList().stream()
//                .limit(5)
//                .forEach(System.out::println);


//40
        List<Car> cars = getCarList();
        System.out.println("++++++++++++++++++++++++++++++++");
        List<String> makeModel = filterCarsByMakeAndModel(cars);
        System.out.println("This displays the list combining make and model of the cars: ");
        System.out.println(makeModel);

//41
        System.out.println("++++++++++++++++++++++++++++++++");
        Optional<Car> filteredCars = findFirstCar(cars);
        System.out.println("The first car on this list is: ");
        System.out.println(filteredCars);

//42

        System.out.println("++++++++++++++++++++++++++++++++");
        Optional<Car> anyCar = findAnyCar(cars);
        System.out.println(anyCar);

//44

        System.out.println("++++++++++++++++++++++++++++++++");
        Map<Boolean, List<Car>> carPartition = partitionByPrice(cars, 16000);
        System.out.println(carPartition);

    }






}
