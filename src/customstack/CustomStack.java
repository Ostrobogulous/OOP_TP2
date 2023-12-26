package customstack;

public class CustomStack {
    private int capacity;
    private int[] stack;
    private int currentIndex;

    public CustomStack(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.currentIndex = -1;
    }

    public boolean stackIsFull() {
        return currentIndex == capacity - 1;
    }

    public boolean stackIsEmpty() {
        return currentIndex == -1;
    }

    public int lastInStack() {
        if (!stackIsEmpty()) {
            return stack[currentIndex];
        } else {
            System.out.println("Empty stack!");
            return -1;
        }
    }

    public void removeElement() {
        if (!stackIsEmpty()) {
            int removedElement = stack[currentIndex];
            currentIndex -= 1;
            System.out.println(removedElement + " is removed from the stack!");
        } else {
            System.out.println("Empty stack!");
        }
    }

    public void addElement(int element) {
        if (!stackIsFull()) {
            currentIndex += 1;
            stack[currentIndex] = element;
            System.out.println(element + " is added to the stack!");
        } else {
            System.out.println("Stack is full!");
        }
    }
}
