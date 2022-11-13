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

  // todo учесть наличие точек и запятых в тексте
  private static String findLargestWord(String text) {
    String largest = "";
    String formattedStr = text.replace("[^A-Za-zА-Яа-яЁё0-9]+", " ");
    String[] textArr = formattedStr.split(" ");

    for (String word : textArr) {
      if (word.length() > largest.length()) {
        largest = word;
      }
    }

    return largest;
  }
}
