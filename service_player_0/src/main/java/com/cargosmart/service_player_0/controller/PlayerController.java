package com.cargosmart.service_player_0.controller;

import com.cargosmart.service_player_0.common.JsonRes;

public interface PlayerController {
  JsonRes login(String playerId, String password);
}
