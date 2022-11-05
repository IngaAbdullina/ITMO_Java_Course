package Lab04.Part1;

import Lab04.ArrayUtil;
import java.util.Arrays;

/**
 * Напишите программу, чтобы проверить, что массив содержит число 1 или 3.
 */
public class Task6 {

  public static void main(String[] args) {
    int[] arr = ArrayUtil.createArrayWithRandomNumbers(10, 10);
    System.out.println(isContains(1, 3, arr));
  }

  // todo вынести генерацию массива в main
  private static boolean isContains(int first, int second, int[] arr) {
    boolean isContains = false;

    for (int i : arr) {
      if (i == first || i == second) {
        isContains = true;
        break;
      }
    }

    System.out.println("Array: " + Arrays.toString(arr));
    System.out.printf("Array contains either %d or %d: ", first, second);
    return isContains;
  }
}
