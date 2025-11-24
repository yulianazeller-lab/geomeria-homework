package stacktest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.*;
import stackwork32.Stack;
import stackwork32.StackOverflowException;
import stackwork32.StackUnderflowException;
public class Stacktest {
    @Test
    void testPushThrowsStackOverflowException() {
        Stack stack = new Stack(2);
        stack.push(2);
        stack.push(4);

        assertThrows(StackOverflowException.class, () -> stack.push(30));
    }
    @Test
    void testPopThrowsStackUnderflowException() {
        Stack stack = new Stack(2);

        assertThrows(StackUnderflowException.class, stack::pop);
    }
    @Test
    void testPeekThrowsStackUnderflowException() {
        Stack stack = new Stack(2);

        assertThrows(StackUnderflowException.class, stack::peek);
    }

    @Test
    void testPushAndPopWorksCorrectly() {
        Stack stack = new Stack(2);
        stack.push(2);
        stack.push(4);

        assertEquals(4, stack.pop());
        assertEquals(2, stack.pop());
    }
}
