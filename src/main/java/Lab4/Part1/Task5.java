package Lab4.Part1;

import Lab4.ArrayUtil;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Напишите программу, чтобы проверить, появляется ли число 3 как первый или
 * последний элемент массива целых чисел. Длина массива должна быть больше или
 * равна двум.
 */
public class Task5 {

  public static void main(String[] args) {
    int number = getNumber();
    int[] arr = ArrayUtil.createArrayWithRandomNumbers(10, 100);
    System.out.println(isElement(number, arr));
  }

  // todo add array as parameter and move array creation in main
  private static boolean isElement(int number, int[] arr) {
    System.out.println("Array: " + Arrays.toString(arr));
    System.out.printf("Array contains element %d: ", number);
    return arr[0] == number || arr[arr.length - 1] == number;
  }

  private static int getNumber() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите целое число от 0 до 100:");
    return scanner.nextInt();
  }
}
