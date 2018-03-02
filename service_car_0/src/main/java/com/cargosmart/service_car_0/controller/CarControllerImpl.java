package com.cargosmart.service_car_0.controller;

import com.cargosmart.service_car_0.bean.Car;
import com.cargosmart.service_car_0.common.JsonRes;
import com.cargosmart.service_car_0.common.BaseRestController;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/car")
public class CarControllerImpl extends BaseRestController implements CarController {

  @Override
  @GetMapping("/GET/{playerId}")
  public JsonRes getPlayerCarList(@PathVariable("playerId") String playerId) {
    List<Car> carList = new ArrayList<>();
    for (int i = 0; i < 4; i++) {
      Car car = new Car();
      car.setId(UUID.randomUUID().toString());
      car.setName("Car" + i);
      car.setPlayerId(playerId);
      carList.add(car);
    }
    return response(200, null, carList);
  }

  @Override
  @GetMapping("/GET")
  public JsonRes getAllSailingCars() {
    List<Car> carList = new ArrayList<>();
    for (int i = 0; i < 4; i++) {
      Car car = new Car();
      car.setId(UUID.randomUUID().toString());
      car.setName("Car" + i);
      car.setPrice(200f * (i + 1));
      carList.add(car);
    }
    return response(200, null, carList);
  }
}
