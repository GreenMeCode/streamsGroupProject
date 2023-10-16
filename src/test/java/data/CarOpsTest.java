package data;

import challenges.CarOps;
import challenges.StudentOps;
import domain.Car;
import domain.Student;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import static challenges.CarOps.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class CarOpsTest {

    private static List<Car> cars;
    @BeforeAll
    static void setUp() throws IOException {
        // Fetch data before all tests
        cars = FetchData.getCarList();
    }

   //40
   @Test
    void shouldReturnListCarsMakeAndModel() {
        List<String> filteredCars = filterCarsByMakeAndModel(cars);
        assertEquals("BMW M",filteredCars.get(15));
        assertEquals("Oldsmobile Bravada",filteredCars.get(16));
    }

    //41
    @Test
    void shouldReturnFirstModelCarInTheList() {
        Optional<Car> filteredCars = findFirstCar(cars);
        assertEquals("Rogue", filteredCars.get().getModel());
    }
    @Test
    void shouldReturnFirstMakeCarInTheList() {
        Optional<Car> filteredCars = findFirstCar(cars);
        assertEquals("Nissan", filteredCars.get().getMake());
    }

    //42
    @Test
    void shouldCheckIfAnyCars(){
        Optional<Car> filteredCars = findAnyCar(cars);
        assertFalse(filteredCars.isEmpty());

    }
}
