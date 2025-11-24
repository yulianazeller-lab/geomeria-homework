package stackwork32;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(2);
        try {
            stack.push(2);
            stack.push(4);
            stack.push(6);
        } catch (StackOverflowException e) {
            System.out.println("Помилка: " + e.getMessage());
        }

        try {
            stack.pop();
            stack.pop();
            stack.pop();
        } catch (StackUnderflowException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }

}
