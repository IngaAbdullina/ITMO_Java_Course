package Lab06.Task5;

public class CustomScanner extends ParentScanner {

    @Override
    public void getUserInfo() {
        System.out.println("Enter your name:");
        System.out.printf("User name is %s \n", super.scanner.nextLine());
    }
}
