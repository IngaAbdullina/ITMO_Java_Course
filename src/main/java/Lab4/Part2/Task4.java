package Lab4.Part2;

import Lab4.ArrayUtil;
import java.util.Arrays;
import java.util.Set;

/**
 * Дан массив чисел. Найдите первое уникальное в этом массиве число.
 * Например, для массива [1, 2, 3, 1, 2, 4] это число 3.
 */
public class Task4 {

  public static void main(String[] args) {
    findUnique();
  }

  private static void findUnique() {
    int[] array = ArrayUtil.createArrayWithRandomNumbers(10, 100);
    int firstUniqueNumber;
    System.out.println(Arrays.toString(array));

    for (int i = 0; i < array.length; i++) {
      boolean isUnique = false;
    }
  }
}
