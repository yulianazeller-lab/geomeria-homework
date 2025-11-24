package stackwork32;

public class Stack implements Stackable {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }
    @Override
    public boolean isEmpty() {
        return top == -1;
    }
    @Override
    public boolean isFull() {
        return top == maxSize - 1;
    }

    @Override
    public void push(int element) {
        if (isFull()) {
            throw new StackOverflowException("Стек заповнений! Неможливо додати елемент: " + element);
        }
        stackArray[++top] = element;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            throw new StackUnderflowException("Стек порожній! Немає елементів для видалення.");
        }
        return stackArray[top--];
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            throw new StackUnderflowException("Стек порожній! Немає верхнього елемента.");
        }
        return stackArray[top];
    }
}