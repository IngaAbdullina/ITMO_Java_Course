package Lab2;

/**
 * Создать класс Calculator. У него должны быть методы:
 * - Сумма
 * - Деление
 * - Умножение
 * - Вычитание
 * Все методы должны быть перегружены и работать с тремя
 * типами данных- double, long и int.
 */
// todo cast
public class Calculator {

  // Сумма
  private double sum(double x, double y){
    return (double) (x + y);
  }

  private long sum(long x, long y){
    return (long) (x + y);
  }

  private int sum(int x, int y){
    return x + y;
  }

  // Деление
  private double div(double x, double y) {
    checkZero((long) y);
    return (double) (x / y);
  }

  private long div(long x, long y) {
    checkZero(y);
    return (long) (x / y);
  }

  private int div(int x, int y) {
    checkZero((long) y);
    return x / y;
  }

  private void checkZero(long number) {
    if (number == 0) {
      System.err.println("Second number must not be 0!");
      throw new ArithmeticException();
    }
  }

  // Умножение
  private double multipl(double x, double y) {
    return (double) (x * y);
  }

  private long multipl(long x, long y) {
    return (long) (x * y);
  }

  private int multipl(int x, int y) {
    return x * y;
  }

  // Вычитание
  private double subtraction(double x, double y){
    return (double) (x - y);
  }

  private long subtraction(long x, long y){
    return (long) (x - y);
  }

  private int subtraction(int x, int y){
    return x - y;
  }
}
