package Lab6.Task5;

import java.util.Scanner;

public class ParentScanner {

    public int getUserAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        return scanner.nextInt();
    }
}
