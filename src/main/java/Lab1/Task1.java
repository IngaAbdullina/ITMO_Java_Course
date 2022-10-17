package Lab1;

import java.util.LinkedList;
import java.util.List;

/**
 * Выведите строки в следующем порядке:
 * Я
 * хорошо
 * знаю
 * Java.
 */
public class Task1 {

  public static void main(String[] args) {
    List<String> words = new LinkedList<>();
    words.add("Я");
    words.add("хорошо");
    words.add("знаю");
    words.add("Java");
    writeToConsole(words);
  }

  private static void writeToConsole(List<String> words){
    words.forEach(System.out::println);
  }
}
