package com.cargosmart.service_player_0.common;

public abstract class BaseRestController {

  public JsonRes response(int code ,String message ,Object data){
    JsonRes jsonRes = new JsonRes();
    jsonRes.setCode(code);
    jsonRes.setMessage(message);
    jsonRes.setData(data);
    return jsonRes;
  }
}
