package Lab01;

import java.util.Scanner;

/**
 * Для целого числа b выполните следующие условные действия:
 * ● Если b нечетное, выведите “Нечетное”
 * ● Если b четное, выведите “Четное”
 * ● Если b четное и больше 100, выведите “Выход за пределы диапазона”
 * ! Использовать класс Scanner: int b = scanner.nextInt()
 */
public class Task6 {

  public static void main(String[] args) {
    readNumber();
  }

  private static void readNumber() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите целое число:");
    int b = scanner.nextInt();

    if (dividesByTwo(b) && b > 100) {
      System.out.println("Выход за пределы диапазона");
    } else if (dividesByTwo(b)) {
      System.out.println("Четное");
    } else {
      System.out.println("Нечетное");
    }
  }

  static boolean dividesByTwo(int b){
    return (b % 2 == 0);
  }
}
