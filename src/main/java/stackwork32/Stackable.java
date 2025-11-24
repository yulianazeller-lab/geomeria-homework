package stackwork32;

public interface Stackable {
    boolean isEmpty();
    boolean isFull();
    void push(int element);
    int pop();
    int peek();
}
