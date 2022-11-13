package Lab10;

import sun.misc.IOUtils;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;

/**
 * 1. Написать метод, который читает текстовый файл и возвращает его в виде списка строк.
 * 2. Написать метод, который записывает в файл строку, переданную параметром.
 * 3. Используя решение 1 и 2, напишите метод, который склеивает два текстовых файла в один.
 * 4. Написать метод, который заменяет в файле все кроме букв и цифр на знак‘$’.
 */
public class Main10 {

    public static void main(String[] args) {
        String path = "C:/Users/Inga/Desktop/ITMO/Java/";
        System.out.println(readTextFromFile(path + "Task_10.txt"));
        writeStringToFile(Collections.singletonList("String to write in file."), path + "Task_10.txt");
        mergeTwoFiles(path + "Task_10.txt", path + "Task_10_additional_file.txt",
                path + "Task_10_third_file");
        changeSymbolsInFile(path, "$");
    }

    // метод, который заменяет в файле все кроме букв и цифр на знак‘$’
    private static void changeSymbolsInFile(String filePath, String symbol) {
        try (FileInputStream input = new FileInputStream(filePath)) {
            String text = new String(IOUtils.readAllBytes(input), StandardCharsets.UTF_8);
            if (text.isEmpty()) {
                System.err.println("File is empty!");
            }

            String str = text.replaceAll("[^A-Za-zА-Яа-яЁё0-9 ,.]+", Matcher.quoteReplacement(symbol));
            writeStringToFile(Collections.singletonList(str), filePath);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error while reading file!");
        }

    }

    // метод, который склеивает два текстовых файла в один
    // todo записать в третий файл
    private static void mergeTwoFiles(String firstFile, String secondFile, String thirdFile) {
        List<String> textFromFirstFile = readTextFromFile(firstFile);
        List<String> textFromSecondFile = readTextFromFile(secondFile);
        assert textFromSecondFile != null;
        assert textFromFirstFile != null;
        textFromFirstFile.addAll(textFromSecondFile);
        writeStringToFile(textFromFirstFile, thirdFile);
    }

    // метод, который записывает в файл строку, переданную параметром
    private static void writeStringToFile(List<String> textFromFirstFile, String filePath) {
        try (FileWriter fw = new FileWriter(filePath)) {
            for (String line : textFromFirstFile) {
                fw.write(line);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    // метод, который читает текстовый файл и возвращает его в виде списка строк
    private static List<String> readTextFromFile(String path) {
        List<String> text = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            text.add(line);
            while (line != null) {
                line = br.readLine();
                text.add(line);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return null;
        }
        return text;
    }
}