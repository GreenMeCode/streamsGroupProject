package data;

import challenges.CarOps;
import challenges.StudentOps;
import domain.Car;
import domain.Student;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarOpsTest {

    private static List<Car> cars;
    @BeforeAll
    static void setUp() throws IOException {
        // Fetch data before all tests
        cars = FetchData.getCarList();
    }

    @Test
    void shouldReturnListCarsMakeAndModel() {
        List<Car> filteredCars = CarOps.filterCarsByMakeAndModel(cars, "Chevrolet","Corvette");
        assertEquals("Chevrolet",filteredCars.get(0).getMake());
        assertEquals("Corvette",filteredCars.get(0).getModel());
    }
}
