package Lab04.Part2;

import Lab04.ArrayUtil;
import java.util.Arrays;

/**
 * Дан массив чисел. Найдите первое уникальное в этом массиве число.
 * Например, для массива [1, 2, 3, 1, 2, 4] это число 3.
 */
public class Task4 {

  public static void main(String[] args) {
    int[] array = ArrayUtil.createArrayWithRandomNumbers(10, 5);
    findUnique(array);
  }

  private static void findUnique(int[] array) {
    Integer firstUniqueNumber = null;
    System.out.println("Unsorted array: " + Arrays.toString(array));

    int[] sortedArray = quickSort(array, 0, array.length - 1);
    System.out.println("Sorted array: " + Arrays.toString(sortedArray));

    for (int i = 0; i < sortedArray.length; i++) {
      boolean isUnique = true;
      for (int j = 0; j < sortedArray.length; j++) {
        if (sortedArray[i] == sortedArray[j] && i != j) {
          isUnique = false;
          break;
        }
      }
      if (isUnique) {
        firstUniqueNumber = sortedArray[i];
      }
    }

    if (firstUniqueNumber == null) {
      System.out.println("There is no unique number in array");
    } else {
      System.out.printf("First unique number in array: %d \n", firstUniqueNumber);
    }
  }



  public static int[] quickSort(int[] array, int leftBorder, int rightBorder) {
    int leftMarker = leftBorder;
    int rightMarker = rightBorder;
    int base = array[(leftMarker + rightMarker) / 2];
    do {
      while (array[leftMarker] < base) {
        leftMarker++;
      }
      while (array[rightMarker] > base) {
        rightMarker--;
      }
      if (leftMarker <= rightMarker) {
        if (leftMarker < rightMarker) {
          int tmp = array[leftMarker];
          array[leftMarker] = array[rightMarker];
          array[rightMarker] = tmp;
        }
        leftMarker++;
        rightMarker--;
      }
    } while (leftMarker <= rightMarker);

    if (leftMarker < rightBorder) {
      quickSort(array, leftMarker, rightBorder);
    }
    if (leftBorder < rightMarker) {
      quickSort(array, leftBorder, rightMarker);
    }

    return array;
  }
}
