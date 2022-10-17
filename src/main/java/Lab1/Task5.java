package Lab1;

import java.util.LinkedHashMap;
import java.util.Map;
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

  private static void readFromConsole() {
    Scanner scanner = new Scanner(System.in);
    Map<String, Integer> map = new LinkedHashMap<>();

    for (int i = 1; i < 5; i++) {
      System.out.printf("%d. Введите целое число: \n", i);
      int number = scanner.nextInt();
      String text = String.format("Число №%d = ", i);
      map.put(text, number);
    }
    scanner.close();
    map.forEach((k,v) -> System.out.println(k + v));
  }
}
