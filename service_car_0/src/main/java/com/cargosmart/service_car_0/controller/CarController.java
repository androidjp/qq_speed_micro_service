package com.cargosmart.service_car_0.controller;

import com.cargosmart.service_car_0.common.JsonRes;

public interface CarController {
  JsonRes getPlayerCarList(String playerId);
  JsonRes getAllSailingCars();
}
