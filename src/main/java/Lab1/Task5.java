package Lab1;

import java.util.Scanner;

/**
 * В этой задаче вы должны считать целые числа из стандартного ввода, а затем вывести. Каждое
 * целое число нужно печатать с новой строки. Формат ввода:
 * 42
 * 100
 * 125
 */
public class Task5 {

  public static void main(String[] args) {
    readFromConsole();
  }

  // todo delete LinkedList
  private static void readFromConsole() {
    Scanner scanner = new Scanner(System.in);

    for (int i = 1; i < 5; i++) {
      System.out.printf("%d. Введите целое число: \n", i);
      int number = scanner.nextInt();
      System.out.printf("Число №%d = %d \n", i, number);
    }
    scanner.close();
  }
}
