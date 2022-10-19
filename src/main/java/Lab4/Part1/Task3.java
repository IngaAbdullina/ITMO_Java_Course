package Lab4.Part1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Напишите программу, чтобы вычислить сумму двух целых чисел и вернуть true, если
 * сумма равна третьему целому числу
 */
public class Task3 {

  public static void main(String[] args) {
    System.out.println(isTrue());
  }

  private static boolean isTrue() {
    List<Integer> numbers = getNumbers();
    int result = numbers.get(0) + numbers.get(1);
    return result == numbers.get(2);
  }

  public static List<Integer> getNumbers() {
    List<Integer> numbers = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Введите первое целое число:");
    int first = scanner.nextInt();
    numbers.add(first);

    System.out.println("Введите второе целое число:");
    int second = scanner.nextInt();
    numbers.add(second);

    System.out.println("Введите третье целое число:");
    int third = scanner.nextInt();
    numbers.add(third);

    return numbers;
  }
}
