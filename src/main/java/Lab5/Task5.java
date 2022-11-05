package Lab5;

/**
 * Напишите метод, который инвертирует слова в строке.
 * Предполагается, что в строке нет знаков препинания, и слова разделены пробелами.
 */
public class Task5 {

  public static void main(String[] args) {
    String origin = "This is a test string";
    System.out.printf("Original string: %s \n", origin);
    System.out.printf("Reversed string: %s \n", reverseWords(origin));
  }

  private static String reverseWords(String origin) {
    StringBuilder sb = new StringBuilder();
    String[] textArr = origin.split(" ");

    for (int i = 0; i < textArr.length; i++) {
      textArr[i] = sb.append(textArr[i]).reverse().toString();
      sb.delete(0, textArr[i].length());
    }

    return convertArrToString(textArr);
  }

  private static String convertArrToString(String[] textArr) {
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < textArr.length; i++) {
      if (i == textArr.length - 1) {
        sb.append(textArr[i]);
        break;
      }
      sb.append(textArr[i]);
      sb.append(" ");
    }

    return sb.toString();
  }
}
