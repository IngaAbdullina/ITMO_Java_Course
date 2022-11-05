package Lab5;

/**
 * Напишите метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]»
 */
public class Task3 {

  public static void main(String[] args) {
    String text = "Строка со словом бяка должна пройти цензуру";
    System.out.println(censor(text));
  }

  private static String censor(String text) {
    String[] textArr = text.split(" ");

    for (int i = 0; i < textArr.length; i++) {
      if (textArr[i].equalsIgnoreCase("бяка")) {
        textArr[i] = "[вырезано цензурой]";
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
