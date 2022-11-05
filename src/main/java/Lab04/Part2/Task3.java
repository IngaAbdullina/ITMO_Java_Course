package Lab04.Part2;

import Lab04.ArrayUtil;
import java.util.Arrays;

/**
 * Напишите метод, который меняет местами первый и последний элемент массива
 */
public class Task3 {

  public static void main(String[] args) {
    int[] baseArr = ArrayUtil.getUserArrayDefaultLengthFive();
    changeFirstAndLastElementInArray(baseArr);
  }

  // todo вынести генерацию массива в main
  private static void changeFirstAndLastElementInArray(int[] baseArr) {
    System.out.println("Base array: " + Arrays.toString(baseArr));

    int temp = baseArr[0];
    baseArr[0] = baseArr[baseArr.length - 1];
    baseArr[baseArr.length - 1] = temp;

    System.out.println("Changed array: " + Arrays.toString(baseArr));
  }
}
