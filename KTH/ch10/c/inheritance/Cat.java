package c.inheritance;

public class Cat extends Animal{
    @Override
    void move() {
        System.out.println("고양이 앞으로");
    }

    @Override
    void eat() {
        System.out.println("고양이 먹는 소리");
    }

    @Override
    void FoodName() {
        FoodName = "Fish";
        System.out.println("cat's food is "+FoodName);
    }
}
