package Lab3.Task2;

public class Animal {

  String type;
  String colour;
  double weight;

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

  public static void getInfo(Animal animal) {
    System.out.println("-==============================-");
    System.out.printf("Kind of animal: %s \n", animal.type);
    System.out.printf("Animal colour: %s \n", animal.colour);
    System.out.printf("Animal weight: %f \n", animal.weight);
  }
}
