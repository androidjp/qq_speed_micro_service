package com.cargosmart.service_player_0.controller.call_service_car.fallback;

import com.cargosmart.service_player_0.common.JsonRes;
import com.cargosmart.service_player_0.controller.call_service_car.ServiceCar0Client;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class ServiceCar0FallbackFactory implements FallbackFactory<ServiceCar0Client> {
  @Override
  public ServiceCar0Client create(final Throwable throwable) {
    System.out.println("[ERROR] : " + throwable);
    return new ServiceCar0Client() {
      @Override
      public JsonRes getPlayerCarList(String playerId) {
        JsonRes res = new JsonRes();
        res.setCode(500);
        res.setMessage("getPlayerCarList fallback: playerId [ " + playerId + " ]");
        return res;
      }
    };
  }
}
