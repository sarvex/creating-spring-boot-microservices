package com.example.explorecalijpa.model;

public enum Region {
  CentralCoast("Central Coast"),
  SouthernCalifornia("Southern Calfornia"),
  NorthernCalifornia("Northern Calfornia"),
  Varies("Varies");

  private String label;
  private Region(String label) {
    this.label = label;
  }

  public static Region findByLabel(String label) {
    for (Region region : Region.values()) {
      if (region.label.equalsIgnoreCase(label)) {
        return region;
      }
    }
    return null;
  }
}
