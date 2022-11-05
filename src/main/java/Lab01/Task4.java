package Lab01;

/**
 * Даны три числа: 3.6, 4.1, 5.9.
 * В переменной result посчитайте произведение этих чисел.
 */
public class Task4 {

  public static void main(String[] args) {
    double first = 3.6;
    double second = 4.1;
    double third = 5.9;
    countMulipl(first, second, third);
  }

  private static void countMulipl(double first, double second, double third) {
    double result = first * second * third;
    System.out.printf("%f * %f * %f = %f", first, second, third, result);
  }
}
