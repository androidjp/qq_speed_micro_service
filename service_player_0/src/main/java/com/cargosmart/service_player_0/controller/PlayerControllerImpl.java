package com.cargosmart.service_player_0.controller;

import com.alibaba.fastjson.JSON;
import com.cargosmart.service_player_0.bean.Car;
import com.cargosmart.service_player_0.bean.Player;
import com.cargosmart.service_player_0.common.BaseRestController;
import com.cargosmart.service_player_0.common.JsonRes;
import com.cargosmart.service_player_0.controller.call_service_car.ServiceCar0Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerControllerImpl extends BaseRestController implements PlayerController {

  @Autowired
  ServiceCar0Client serviceCar0Client;

  @Override
  @PostMapping("/POST/login")
  public JsonRes login(@RequestParam(value = "player_id") String playerId, @RequestParam(value = "password") String password) {
    Player player = new Player();
    player.setId(playerId);
    player.setName("playerA");

    JsonRes carListJR = serviceCar0Client.getPlayerCarList(playerId);
    player.setCarList((List<Car>) carListJR.getData());
    return response(200, "success", player);
  }
}
