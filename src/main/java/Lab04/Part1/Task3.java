package Lab04.Part1;

import java.util.Scanner;

/**
 * Напишите программу, чтобы вычислить сумму двух целых чисел и вернуть true, если
 * сумма равна третьему целому числу
 */
public class Task3 {

  public static void main(String[] args) {
    System.out.println(isTrue());
  }

  // todo simplify
  private static boolean isTrue() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Введите первое целое число:");
    int first = scanner.nextInt();

    System.out.println("Введите второе целое число:");
    int second = scanner.nextInt();

    System.out.println("Введите третье целое число:");
    int third = scanner.nextInt();

    return first + second == third;
  }
}
