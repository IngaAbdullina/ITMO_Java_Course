package Lab4.Part1;

/**
 * Напишите программу, которая выводит числа от 1 до 100, которые делятся на 3, 5 и на
 * то и другое (то есть и на 3 и на 5).
 */
public class Task2 {
    public static void main(String[] args) {
        writeNumbers(1, 100);
    }

    private static void writeNumbers(int from, int to) {
        for (int i = from; i <= to; i++) {
            if (dividesByThreeOrFive(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean dividesByThreeOrFive(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.print("Делится и на 3, и на 5: ");
            return true;
        } else if (num % 3 == 0) {
            System.out.print("Делится на 3: ");
            return true;
        } else if (num % 5 == 0) {
            System.out.print("Делится на 5: ");
            return true;
        } else {
            return false;
        }
    }
}
