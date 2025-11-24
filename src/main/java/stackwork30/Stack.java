package stackwork30;

public class Stack implements Stackable {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int max) {
        this.maxSize = max;
        stackArray = new int[maxSize];
        top = -1;
    }
    @Override
    public boolean isEmpty() {
        return (top == -1);
    }
    @Override
    public boolean isFull() {
        return (top == maxSize - 1);
    }
    @Override
    public void push(int element) {
        if (isFull()) {
            System.out.println("Стек заповнений! Неможливо додати елемент: " + element);
        } else {
            stackArray[++top] = element;
            System.out.println("Елемент " + element + " додано у стек.");
        }
    }
    @Override
    public int pop() {
        if (isEmpty()) {
            System.out.println("Стек порожній! Немає елементів для видалення.");
            return -1; //помилка
        } else {
            int value = stackArray[top--];
            System.out.println("Елемент " + value + " видалено зі стеку.");
            return value;
        }
    }
    @Override
    public int peek() {
        if (isEmpty()) {
            System.out.println("Стек порожній! Немає верхнього елемента.");
            return -1;
        } else {
            return stackArray[top];
        }
    }
}
