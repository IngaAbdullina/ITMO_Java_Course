package Lab5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Имеются две строки. Найти количество вхождений одной (являющейся подстрокой) в другую.
 */
public class Task4 {

  public static void main(String[] args) {
    String baseStr = "Parent string that contains substring";
    String substring = "string";
    int occurrencesNumber = countOccurrencesNumber(baseStr, substring);
    System.out.printf("Строка '%s' входит в строку '%s' %d раз(а) \n", substring, baseStr, occurrencesNumber);
  }

  private static int countOccurrencesNumber(String baseStr, String substring) {
    Pattern pattern = Pattern.compile(substring);
    Matcher matcher = pattern.matcher(baseStr);
    int count = 0;

    while (matcher.find()) {
      count++;
    }
    return count;
  }
}
