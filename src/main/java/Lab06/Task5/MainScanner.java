package Lab06.Task5;

public class MainScanner {

    public static void main(String[] args) {
        ParentScanner parentScanner = new ParentScanner();
        CustomScanner customScanner = new CustomScanner();
        parentScanner.getUserInfo();
        customScanner.getUserInfo();
    }
}
