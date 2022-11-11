package Lab10;

import sun.misc.IOUtils;
import sun.nio.ch.IOUtil;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.regex.Matcher;

/**
 * 1. Написать метод, который читает текстовый файл и возвращает его в виде списка строк.
 * 2. Написать метод, который записывает в файл строку, переданную параметром.
 * 3. Используя решение 1 и 2, напишите метод, который склеивает два текстовых файла в один.
 * 4. Написать метод, который заменяет в файле все кроме букв и цифр на знак‘$’.
 */
public class Main10 {

    public static void main(String[] args) {
        String path = "C:/Users/Inga/Desktop/ITMO/Java/Task_10.txt";
//        System.out.println(Arrays.toString(readTextFromFile(path)));
//        writeStringToFile("String to write in file.", path);
//        mergeTwoFiles(path, "C:/Users/Inga/Desktop/ITMO/Java/Task_10_additional_file.txt");
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
            writeStringToFile(str, filePath);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error while reading file!");
        }

    }

    // метод, который склеивает два текстовых файла в один
    private static void mergeTwoFiles(String firstFile, String secondFile) {
        String[] textFromSecondFile = readTextFromFile(secondFile);
        StringBuilder sb = new StringBuilder(textFromSecondFile.length);
        for (String s : textFromSecondFile) {
            sb.append(s);
            sb.append(" ");
        }
        String text = sb.toString();

        writeStringToFile(text, firstFile);
    }

    // метод, который записывает в файл строку, переданную параметром
    private static void writeStringToFile(String str, String path) {
        try {
            Files.write(Paths.get(path), str.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(readTextFromFile(path)));
    }

    // метод, который читает текстовый файл и возвращает его в виде списка строк
    private static String[] readTextFromFile(String path) {
        String[] text;
        try (FileInputStream input = new FileInputStream(path)) {
            String s = new String(IOUtils.readAllBytes(input), StandardCharsets.UTF_8);
            if (s.isEmpty()) {
                return new String[]{"File is empty!"};
            }

            text = s.split(" ");
        } catch (IOException e) {
            e.printStackTrace();
            return new String[]{"Error while reading file!"};
        }
        return text;
    }
}