package Lab05;

/**
 * Напишите метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]»
 */
public class Task3 {

  public static void main(String[] args) {
    String text = "Строка со словом бяка должна пройти цензуру";
    System.out.println(censor(text, "бяка", "[вырезано цензурой]"));
  }

  // todo добавить параметры
  private static String censor(String text, String forbidden, String censorPhrase) {
    String[] textArr = text.split(" ");

    for (int i = 0; i < textArr.length; i++) {
      if (textArr[i].equalsIgnoreCase(forbidden)) {
        textArr[i] = censorPhrase;
      }
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
