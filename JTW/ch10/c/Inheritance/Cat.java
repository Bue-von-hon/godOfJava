package c.Inheritance;

public class Cat extends Animal {
    private boolean hasTail;

    public Cat(boolean hasTail, String name, String kind, int legCount, int iq, boolean hasWings) {
        super(name, kind, legCount, iq, hasWings);
        this.hasTail = hasTail;
    }

    @Override
    public void move() {
        System.out.println("Cat moves");
    }

    @Override
    public void eatFood() {
        System.out.println("Cat eats");
    }

    public boolean isTailExisted() {
        return hasTail;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "hasTail=" + hasTail +
                ", name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                ", legCount=" + legCount +
                ", iq=" + iq +
                ", hasWings=" + hasWings +
                '}';
    }
}
