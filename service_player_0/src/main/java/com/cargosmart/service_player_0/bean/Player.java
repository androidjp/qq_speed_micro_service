package com.cargosmart.service_player_0.bean;

import java.util.List;

public class Player {
  private String id;
  private String name;
  private String password;
  private List<Car> carList;
  private Car defaultCar;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public List<Car> getCarList() {
    return carList;
  }

  public void setCarList(List<Car> carList) {
    this.carList = carList;
  }

  public Car getDefaultCar() {
    return defaultCar;
  }

  public void setDefaultCar(Car defaultCar) {
    this.defaultCar = defaultCar;
  }
}
