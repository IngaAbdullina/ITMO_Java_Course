package Lab3.Task2;

public class JavaProgram {

  public static void main(String[] args) {
    Animal lion = new Animal("tiger", "orange and black", 300.2);
    Animal seal = new Animal("seal", "black", 220.5);
    Animal wolf = new Animal("wolf", "gray", 40.3);

    lion.getInfo();
    seal.getInfo();
    wolf.getInfo();
  }
}
