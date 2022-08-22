package c.inheritance;

public class Dog extends Animal{
    String favoriteDogfood;
    @Override
    void move() {
        System.out.println("멍멍");
    }

    @Override
    void eat() {
        System.out.println("강아지가 먹는 소리");
    }
}
