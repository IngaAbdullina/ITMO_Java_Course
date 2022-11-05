package Lab06.Task5;

public class CustomScanner extends ParentScanner {

    @Override
    public int getUserAge() {
        int age = super.getUserAge();
        System.out.print("User age is ");
        return age;
    }
}
