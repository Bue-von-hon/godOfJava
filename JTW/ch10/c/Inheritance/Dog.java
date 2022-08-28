package c.Inheritance;

public class Dog extends Animal{
    private boolean hasTeeth;

    public Dog(boolean hasTeeth, String name, String kind, int legCount, int iq, boolean hasWings) {
        super(name, kind, legCount, iq, hasWings);
        this.hasTeeth = hasTeeth;
    }

    @Override
    public void move() {
        System.out.println("Dog moves");
    }
    @Override
    public void eatFood() {
        System.out.println("Dog eats");
    }

    public boolean isTeethExisted() {
        return hasTeeth;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "hasTeeth=" + hasTeeth +
                ", name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                ", legCount=" + legCount +
                ", iq=" + iq +
                ", hasWings=" + hasWings +
                '}';
    }
}
