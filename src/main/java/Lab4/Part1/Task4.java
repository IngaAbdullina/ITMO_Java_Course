package Lab4.Part1;

import java.util.List;

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
    List<Integer> numbers = Task3.getNumbers();
    return numbers.get(0) < numbers.get(1) && numbers.get(1) < numbers.get(2);
  }
}
