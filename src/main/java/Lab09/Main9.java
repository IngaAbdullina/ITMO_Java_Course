package Lab09;

import java.util.*;

public class Main9 {

    public static void main(String[] args) {
        // First task
//        List<Cat> cats = getCats();
//        displayUniqueCats(getUniqueCats(cats));
//
//        // Second task
//        List<Integer> arrayInts = getFilledArrayList();
//        List<Integer> linkedInts = getFilledLinkedList();
//        getRandomNumber(arrayInts);
//        getRandomNumber(linkedInts);

        // Third task
        getUserScore();
    }

    private static void getUserScore() {
        Scanner scanner = new Scanner(System.in);
        Map<User, Integer> usersMap = createUsersMap();
        boolean failure = true;
        User userToFind;

        do {
            System.out.println("Enter user's name:");
            String name = scanner.next();
            userToFind = new User(name);

            if (!usersMap.containsKey(userToFind)) {
                System.err.printf("No user with name %s \n", name);
            } else {
                int score = usersMap.get(userToFind);
                failure = false;
                System.out.printf("%s's score is %d \n", name, score);
            }
        } while (failure);

    }

    // todo Map<User, Int>
    private static Map<User, Integer> createUsersMap() {
        Map<User, Integer> map = new HashMap<>();
        map.put(new User("Jane"), (int) (Math.random() * 10));
        map.put(new User("Jonas"), (int) (Math.random() * 10));
        map.put(new User("Tom"), (int) (Math.random() * 10));
        map.put(new User("Bob"), (int) (Math.random() * 10));
        map.put(new User("Anna"), (int) (Math.random() * 10));

        return map;
    }

    private static void getRandomNumber(List<Integer> integers) {
        long start = System.currentTimeMillis();
        int listLength = integers.size();

        for (int i = 0; i < 100000; i++) {
            int index = (int) (Math.random() * listLength);
//            int temp = integers.get(index);
            integers.get(index);
        }

        long resultTime = System.currentTimeMillis() - start;

        if (integers instanceof ArrayList) {
            System.out.printf("Getting 100 000 elements by random index from ArrayList took %d milliseconds \n",
                    resultTime);
        } else {
            System.out.printf("Getting 100 000 elements by random index from LinkedList took %d milliseconds \n",
                    resultTime);
        }
    }

    private static List<Integer> getFilledLinkedList() {
        long start = System.currentTimeMillis();
        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < 1000000; i++) {
            list.add((int) (Math.random() * 10));
        }

        long resultTime = System.currentTimeMillis() - start;
        System.out.printf("Adding 1 million elements to LinkedList took %d milliseconds \n", resultTime);
        return list;
    }

    private static List<Integer> getFilledArrayList() {
        long time = System.currentTimeMillis();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 1000000; i++) {
            list.add((int) (Math.random() * 10));
        }

        long resultTime = System.currentTimeMillis() - time;
        System.out.printf("Adding 1 million elements to ArrayList took %d milliseconds \n", resultTime);
        return list;
    }

    private static void displayUniqueCats(Set<Cat> uniqueCats) {
        System.out.println("HashSet size: " + uniqueCats.size());
        for (Cat cat : uniqueCats) {
            System.out.println(cat);
        }
    }

    public static Set<Cat> getUniqueCats(List<Cat> cats) {
        return new HashSet<>(cats);
    }

    public static List<Cat> getCats() {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("sphinx", "Luna", 6));
        cats.add(new Cat("sphinx", "Luna", 6));
        cats.add(new Cat("sphinx", "Luna", 7));
        cats.add(new Cat("abyssinian", "Lucy", 13));
        cats.add(new Cat("abyssinian", "Lucy", 13));
        cats.add(new Cat("abyssinian", "Lily", 10));
        cats.add(new Cat("bengal", "Cleo", 3));
        cats.add(new Cat("bengal", "Cleo", 3));
        cats.add(new Cat("bengal", "Bella", 11));

        System.out.println("ArrayList size: " + cats.size());
        return cats;
    }
}
