package duck;

public class MallardDuck extends Duck implements Quackable, Flyable {
    public void display() {
        System.out.println("This is Mallard Duck ^_^");
    }

    @Override
    public void quack() {
        super.quack();
        System.out.println("Mallard Duck is quacking!");
    }

    @Override
    public void fly() {
        System.out.println("Mallard Duck is flying.");
    }
}
