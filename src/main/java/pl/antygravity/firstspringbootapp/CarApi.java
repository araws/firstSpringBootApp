package pl.antygravity.firstspringbootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarApi {

    @Autowired
    private CarManager carManager;

}
