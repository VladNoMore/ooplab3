import Queue.ArrayStack;
import Queue.LinkedStack;
import Queue.Stack;
import Queue.StackUsingQueues;

public class Main {
    public static void main(String[] args) {
        // Example usage of ArrayStack
        Stack<Integer> arrayStack = new ArrayStack<>(5);
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);

        System.out.println("ArrayStack size: " + arrayStack.size());
        System.out.println("ArrayStack top element: " + arrayStack.peek());

        while (!arrayStack.isEmpty()) {
            System.out.println("Popped from ArrayStack: " + arrayStack.pop());
        }

        System.out.println("ArrayStack size after popping: " + arrayStack.size());

        // Example usage of LinkedStack
        Stack<String> linkedStack = new LinkedStack<>();
        linkedStack.push("One");
        linkedStack.push("Two");
        linkedStack.push("Three");

        System.out.println("\nLinkedStack size: " + linkedStack.size());
        System.out.println("LinkedStack top element: " + linkedStack.peek());

        while (!linkedStack.isEmpty()) {
            System.out.println("Popped from LinkedStack: " + linkedStack.pop());
        }

        System.out.println("LinkedStack size after popping: " + linkedStack.size());

        // Example usage of StackUsingQueues
        Stack<Character> stackUsingQueues = new StackUsingQueues<>();
        stackUsingQueues.push('A');
        stackUsingQueues.push('B');
        stackUsingQueues.push('C');

        System.out.println("\nStackUsingQueues size: " + stackUsingQueues.size());
        System.out.println("StackUsingQueues top element: " + stackUsingQueues.peek());

        while (!stackUsingQueues.isEmpty()) {
            System.out.println("Popped from StackUsingQueues: " + stackUsingQueues.pop());
        }

        System.out.println("StackUsingQueues size after popping: " + stackUsingQueues.size());
    }
}
