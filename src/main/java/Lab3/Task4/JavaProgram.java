package Lab3.Task4;

public class JavaProgram {

  public static void main(String[] args) {
    Tree firstTree = new Tree();
    Tree secondTree = new Tree(100, "oak");
    Tree thirdTree = new Tree(58, true, "spruce");
    System.out.println(firstTree);
    System.out.println(secondTree);
    System.out.println(thirdTree);
  }
}
