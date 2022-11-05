package Lab03.Task3;

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

  // todo add parameter and simplify
  protected int countBuildYearsFromNow(int buildYear) {
    return 2022 - buildYear;
  }
}
