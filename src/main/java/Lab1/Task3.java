package Lab1;

/**
 * В переменной number лежит целое число 10500. В переменной result посчитайте следующее
 * выражение: (number / 10) / 10. Результат выведите на консоль.
 */
public class Task3 {

  public static void main(String[] args) {
    int number = 10500;
    divideNUmber(number);
  }

  // todo int -> double
  private static void divideNUmber(double number) {
    double result = (number / 10) / 10;
    System.out.printf("(%f / 10) / 10 = %f", number, result);
  }
}
