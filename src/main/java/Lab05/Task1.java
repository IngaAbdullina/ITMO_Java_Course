package Lab05;

/**
 * Написать метод для поиска самого длинного слова в тексте
 */
public class Task1 {

  public static void main(String[] args) {
    String text = "You should find the largest word in this text";
    System.out.println(text);
    System.out.println("The largest word in text above: " + findLargestWord(text));
  }

  private static String findLargestWord(String text) {
    String largest = "";
    String[] textArr = text.split(" ");

    for (String word : textArr) {
      if (word.length() > largest.length()) {
        largest = word;
      }
    }

    return largest;
  }
}
