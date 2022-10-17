package Lab3.Task3;

import java.util.Calendar;

public class House {

  private int floorCount;

  private int buildYear;

  private String name;

  public int getFloorCount() {
    return floorCount;
  }

  public void setFloorCount(int floorCount) {
    this.floorCount = floorCount;
  }

  public int getBuildYear() {
    return buildYear;
  }

  public void setBuildYear(int buildYear) {
    this.buildYear = buildYear;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int countBuildYearsFromNow() {
    int currentYear = Calendar.getInstance().get(Calendar.YEAR);
    return currentYear - this.buildYear;
  }
}
