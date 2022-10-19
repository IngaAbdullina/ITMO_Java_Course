package Lab4.Part1;

/**
 * Напишите программу, которая выводит на консоль нечетные числа от 1 до 99. Каждое
 * число печатается с новой строки
 */
public class Task1 {
    public static void main(String[] args) {
        writeOddNumbers(1, 100);
    }

    private static void writeOddNumbers(int firstIndex, int lastIndex) {
        for (int i = firstIndex; i < lastIndex; i++) {
            if (!dividesByTwo(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean dividesByTwo(int b){
        return (b % 2 == 0);
    }
}
