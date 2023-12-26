package duck;

abstract class Duck {
    public void quack() {
        System.out.println("Quaaaack >.<");
    }

    public void swim() {
        System.out.println("Swimmiiiing -.-");
    }

    public abstract void display();
}
