// Java program to copy stack
import java.util.Stack;
// Java program to copy stack
public class Stack_copy {
    static void copied_stack(Stack<Integer> stack){
        System.out.println("Original stack");
        System.out.println(stack);

        System.out.println("Copied stack");
        System.out.println(stack.clone());
    }
    public static void main(String args[])
    {
        Stack<Integer>stack = new Stack<>();
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
        stack.add(50);
        stack.add(60);
        stack.add(70);
        stack.add(80);
        stack.add(90);
        stack.add(100);
        copied_stack(stack);
    }
}

