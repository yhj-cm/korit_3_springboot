package com.example.cardatabase.web;


import com.example.cardatabase.domain.Car;
import com.example.cardatabase.domain.CarReopository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
    private final CarReopository reopository;

    @GetMapping("/cars")
    public Iterable<Car> getCars() {
        //자동차를 검색하고 나서 반환
        return reopository.findAll();

    }
}
