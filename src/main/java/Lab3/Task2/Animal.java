package Lab3.Task2;

public class Animal {

  // todo make fields private
  private String type;
  private String colour;
  private double weight;

  public Animal(String type, String colour, double weight) {
    this.type = type;
    this.colour = colour;
    this.weight = weight;
  }

  public Animal(String colour, double weight) {
    this.colour = colour;
    this.weight = weight;
  }

  public Animal(String colour) {
    this.colour = colour;
  }

  public Animal() {
  }

  // todo make non-static
  public void getInfo() {
    System.out.println("-==============================-");
    System.out.printf("Kind of animal: %s \n", this.type);
    System.out.printf("Animal colour: %s \n", this.colour);
    System.out.printf("Animal weight: %f \n", this.weight);
  }
}
