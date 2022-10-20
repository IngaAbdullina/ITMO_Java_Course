package Lab1;

/**
 * Посчитайте результат выражения
 * (46 + 10) * (10 / 3)
 * (29) * (4) * (-15)
 */
public class Task2 {

  public static void main(String[] args) {
    countFirst(46, 10, 10, 3);
    countSecond(29, 4, -15);
  }

  // todo int -> double
  private static void countFirst(double first, double second, double third, double forth) {
    if (forth == 0) {
      System.err.println("Forth number must not be 0!");
      throw new ArithmeticException();
    }
    double result = (first + second) * (third / forth);
    System.out.printf("(%f + %f) * (%f / %f) = %f \n", first, second, third, forth, result);
  }

  private static void countSecond(double first, double second, double third) {
    double result = (first) * (second) * (third);
    System.out.printf("(%f) * (%f) * (%f) = %f", first, second, third, result);
  }
}
