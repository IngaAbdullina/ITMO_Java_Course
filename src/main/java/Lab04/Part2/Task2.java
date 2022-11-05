package Lab04.Part2;

import Lab04.ArrayUtil;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Напишите программу, которая считывает с клавиатуры длину массива (например,
 * пользователь вводит цифру 4), затем пользователь вводит числа и на новой
 * строке выводится массив из 4 элементов.
 */
public class Task2 {

  public static void main(String[] args) {
    int arrayLength = getArrayLength();
    int[] arr = ArrayUtil.getUserArrayStrictLength(arrayLength);
    System.out.printf("Array length: %d \n", arrayLength);
    System.out.println("Result: " + Arrays.toString(arr));
  }

  private static int getArrayLength() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter array length:");
    return scanner.nextInt();
  }
}
