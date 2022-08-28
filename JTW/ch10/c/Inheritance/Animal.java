package c.Inheritance;

public class Animal {
    protected String name;
    protected String kind;
    protected int legCount;
    protected int iq;
    protected boolean hasWings;

    public Animal(String name, String kind, int legCount, int iq, boolean hasWings) {
        this.name = name;
        this.kind = kind;
        this.legCount = legCount;
        this.iq = iq;
        this.hasWings = hasWings;
    }

    public void move() {
        System.out.println("Animal moves");
    }

    public void eatFood() {
        System.out.println("Animal eats");
    }
}
