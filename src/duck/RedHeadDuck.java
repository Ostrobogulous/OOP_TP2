package duck;

public class RedHeadDuck extends Duck implements Quackable, Flyable {
    public void display() {
        System.out.println("This is Red Head Duck *_*");
    }

    @Override
    public void quack() {
        super.quack();
        System.out.println("Rubber Duck is quacking!");
    }

    @Override
    public void fly() {
        System.out.println("Red Head Duck is flying!");
    }
}
