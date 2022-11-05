package Lab04.Part2;

import Lab04.ArrayUtil;

/**
 * Напишите программу, которая проверяет отсортирован ли массив по
 * возрастанию. Если он отсортирован по возрастанию то выводится “OK”, если нет,
 * то будет выводиться текст “Please, try again”
 */
public class Task1 {
  public static void main(String[] args) {
    int[] arr = ArrayUtil.getUserArrayDefaultLengthFive();
    checkSorted(arr);
  }

  private static void checkSorted(int[] arr) {
    boolean isSorted = true;
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        isSorted = false;
        break;
      }
    }

    if (isSorted) {
      System.out.println("OK");
    } else {
      System.out.println("Please, try again");
    }
  }
}
