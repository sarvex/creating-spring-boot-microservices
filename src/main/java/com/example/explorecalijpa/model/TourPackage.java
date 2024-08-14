package com.example.explorecalijpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="tour_package")
@Entity
public class TourPackage {
  @Id
  private String code;

  @Column
  private String name;

  public TourPackage(String code, String name) {
    this.code = code;
    this.name = name;
  }

  protected TourPackage() {}

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
