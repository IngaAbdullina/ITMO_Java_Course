package Lab4.Part2;

import Lab4.ArrayUtil;
import java.util.Arrays;

/**
 * Напишите метод, который меняет местами первый и последний элемент массива
 */
public class Task3 {

  public static void main(String[] args) {
    changeFirstAndLastElementInArray();
  }

  private static void changeFirstAndLastElementInArray() {
    int[] baseArr = ArrayUtil.getUserArrayDefaultLengthFive();
    System.out.println("Base array: " + Arrays.toString(baseArr));

    int temp = baseArr[0];
    baseArr[0] = baseArr[baseArr.length - 1];
    baseArr[baseArr.length - 1] = temp;

    System.out.println("Changed array: " + Arrays.toString(baseArr));
  }
}
