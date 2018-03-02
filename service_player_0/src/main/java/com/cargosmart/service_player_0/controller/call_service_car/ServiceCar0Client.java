package com.cargosmart.service_player_0.controller.call_service_car;

import com.cargosmart.service_player_0.common.JsonRes;
import com.cargosmart.service_player_0.controller.call_service_car.fallback.ServiceCar0FallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "service-car-0", fallbackFactory = ServiceCar0FallbackFactory.class)
public interface ServiceCar0Client {
  @RequestMapping(method = RequestMethod.GET, path = "/car/GET/{playerId}")
  JsonRes getPlayerCarList(@PathVariable("playerId") String playerId);
}
