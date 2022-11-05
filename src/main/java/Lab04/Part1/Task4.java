package Lab04.Part1;

import java.util.Scanner;

/**
 * Напишите программу, которая принимает от пользователя три целых числа и
 * возвращает true, если второе число больше первого числа, а третье число больше
 * второго числа
 */
public class Task4 {
  public static void main(String[] args) {
    System.out.println(isTrue());
  }

  private static boolean isTrue() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Введите первое целое число:");
    int first = scanner.nextInt();

    System.out.println("Введите второе целое число:");
    int second = scanner.nextInt();

    System.out.println("Введите третье целое число:");
    int third = scanner.nextInt();

    return first < second && second < third;
  }
}
