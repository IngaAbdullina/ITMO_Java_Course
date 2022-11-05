package Lab04;

import java.util.Scanner;

public class ArrayUtil {

  public static int[] getUserArrayDefaultLengthFive() {
    Scanner scanner = new Scanner(System.in);
    int[] arr = new int[5];

    for (int i = 0; i < arr.length; i++) {
      System.out.printf("%d/%d. Введите целое число: \n", i + 1, arr.length);
      arr[i] = scanner.nextInt();
    }
    return arr;
  }

  public static int[] getUserArrayStrictLength(int arrayLength) {
    Scanner scanner = new Scanner(System.in);
    int[] arr = new int[arrayLength];

    for (int i = 0; i < arr.length; i++) {
      System.out.printf("%d/%d. Введите целое число: \n", i + 1, arr.length);
      arr[i] = scanner.nextInt();
    }
    return arr;
  }

  public static int[] createArrayWithRandomNumbers(int arrLength, int randomLimit) {
    int[] arr = new int[arrLength];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int) (Math.random() * randomLimit);
    }
    return arr;
  }
}
