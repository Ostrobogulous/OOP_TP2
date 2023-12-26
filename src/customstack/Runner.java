package customstack;

public class Runner {
    public static void main(String[] args) {
        CustomStack customStack = new CustomStack(5);
        System.out.println("last element in stack: " + customStack.lastInStack());
        customStack.addElement(73);
        customStack.addElement(55);
        customStack.addElement(88);
        System.out.println("last element in stack: " + customStack.lastInStack());
        customStack.addElement(5);
        customStack.addElement(5);
        customStack.addElement(5);
        customStack.removeElement();
        customStack.removeElement();
        customStack.removeElement();
        customStack.removeElement();
        customStack.removeElement();
        customStack.removeElement();
    }
}
