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

  private static void countFirst(int first, int second, int third, int forth) {
    if (forth == 0) {
      System.err.println("Forth number must not be 0!");
      throw new ArithmeticException();
    }
    int result = (first + second) * (third / forth);
    System.out.printf("(%d + %d) * (%d / %d) = %d\n", first, second, third, forth, result);
  }

  private static void countSecond(int first, int second, int third) {
    int result = (first) * (second) * (third);
    System.out.printf("(%d) * (%d) * (%d) = %d", first, second, third, result);
  }
}
