package pl.antygravity.firstspringbootapp;

import java.util.ArrayList;
import java.util.List;

public class CarManager {

    private List<Car> carList;

    public CarManager() {
        this.carList = new ArrayList<>();
        carList.add(new Car("Citroen", "C4"));
        carList.add(new Car("Citroen", "Berlingo"));
        carList.add(new Car("Audi", "A8"));
    }
}
