package duck;

public class Runner {

    public static void main(String[] args) {
        DecoyDuck decoyDuck = new DecoyDuck();
        RubberDuck rubberDuck = new RubberDuck();
        MallardDuck mallardDuck = new MallardDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();

        decoyDuck.display();
        decoyDuck.swim();
        decoyDuck.quack();
        System.out.println();

        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.quack();
        System.out.println();

        redHeadDuck.display();
        redHeadDuck.swim();
        redHeadDuck.quack();
        redHeadDuck.fly();
        System.out.println();

        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.quack();
        mallardDuck.fly();
    }


}
