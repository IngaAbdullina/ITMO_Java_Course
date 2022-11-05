package Lab05;

/**
 * Написать метод, который проверяет, является ли слово палиндромом
 */
public class Task2 {

  public static void main(String[] args) {
    String str = "Анна";
//    String str = "Александр";
    System.out.printf("Is word [%s] palindrome? %b", str, isPalindrome(str));
  }

  private static boolean isPalindrome(String str) {
    String reverseStr = new StringBuilder(str).reverse().toString();
    return str.equalsIgnoreCase(reverseStr);
  }
}
