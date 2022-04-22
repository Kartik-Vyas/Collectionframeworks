import java.util.List;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("Tiger");
        stack.push("Horse");
        stack.push("Dog");
        stack.push("Cat");
        System.out.println(stack);
        //peek
        System.out.println(stack.peek());
        //pop
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
    }
}
