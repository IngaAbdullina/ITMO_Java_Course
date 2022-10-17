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

  private static void divideNUmber(int number) {
    int result = (number / 10) / 10;
    System.out.printf("(%d / 10) / 10 = %d", number, result);
  }
}
