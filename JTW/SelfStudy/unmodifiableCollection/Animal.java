package unmodifiableCollection;

public class Animal {
    private final Age age;

    public Animal(Age age) {
        this.age = age;
    }

    public Age getAge() {
        return age;
    }
}

class Age {
    private int value;

    public Age(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
