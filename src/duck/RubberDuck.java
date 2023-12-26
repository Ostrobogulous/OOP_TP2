package duck;

public class RubberDuck extends Duck implements Quackable {
    public void display() {
        System.out.println("This is the Rubber Duck o_o");
    }

    @Override
    public void quack() {
        super.quack();
        System.out.println("Rubber Duck is quacking!");
    }
}
