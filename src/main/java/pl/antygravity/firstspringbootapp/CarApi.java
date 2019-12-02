package pl.antygravity.firstspringbootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarApi {

    private final CarManager carManager;

    @Autowired
    public CarApi(CarManager carManager) {
        this.carManager = carManager;
    }

    @GetMapping("/getCars")
    public List<Car> getCars() {
        return carManager.getCarList();
    }
}
