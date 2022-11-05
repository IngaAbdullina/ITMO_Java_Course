package Lab09;

import java.util.Objects;

public class Cat {

    private String breed;
    private String name;
    private int age;

    public Cat(String breed, String name, int age) {
        this.breed = breed;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && breed.equals(cat.breed) && name.equals(cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed, name, age);
    }

    @Override
    public String toString() {
        return "Cat {" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
