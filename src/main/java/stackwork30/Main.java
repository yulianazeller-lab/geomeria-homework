package stackwork30;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(3);

        stack.push(2);
        stack.push(4);
        stack.push(6);
        stack.push(8);

        System.out.println("Верхній елемент: " + stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}
