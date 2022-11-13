package Lab06.Task4;

import java.util.Scanner;

public class Cat {

    public int age;

    // todo scanner
    public Cat() {
        readAge();
    }

    private void readAge() {
        System.out.println("Enter cat's age:");
        Scanner sc = new Scanner(System.in);
        this.age = sc.nextInt();
        sc.close();
    }
}
