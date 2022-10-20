package Lab3.Task3;

public class JavaProgram {

  public static void main(String[] args) {
    House firstHouse = createFirstHouse();
    House secondHouse = createSecondHouse();

    System.out.printf("Info about house [Name: %s; year or building: %d, number of floors: %d] \n",
        firstHouse.getName(), firstHouse.getBuildYear(), firstHouse.getFloorCount());
    System.out.printf("Number of years from the date the house %s was built: %d \n",
        firstHouse.getName(), firstHouse.countBuildYearsFromNow(firstHouse.getBuildYear()));

    System.out.println("-=============================================================-");

    System.out.printf("Info about house [Name: %s; year or building: %d, number of floors: %d] \n",
        secondHouse.getName(), secondHouse.getBuildYear(), secondHouse.getFloorCount());
    System.out.printf("Number of years from the date the house %s was built: %d \n",
        secondHouse.getName(), secondHouse.countBuildYearsFromNow(secondHouse.getBuildYear()));

  }

  private static House createFirstHouse() {
    House firstHouse = new House();
    firstHouse.setBuildYear(1985);
    firstHouse.setFloorCount(9);
    firstHouse.setName("first");
    return firstHouse;
  }

  private static House createSecondHouse() {
    House secondHouse = new House();
    secondHouse.setName("second");
    secondHouse.setFloorCount(5);
    secondHouse.setBuildYear(1998);
    return secondHouse;
  }
}
