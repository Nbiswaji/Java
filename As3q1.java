package Biswajit.Java;
import java.util.Scanner;

public class As3q1 {
    int maxSize;
    int top;
    int[] stackArray;

    As3q1() {

    }

    public void Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
            System.out.println("Pushed: " + value);
        } else {
            System.out.println("Stack is full. Cannot push " + value);
        }
    }

    public int pop() {
        if (top >= 0) {
            int value = stackArray[top--];
            System.out.println("Popped: " + value);
            return value;
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
    }

    public int peek() {
        if (top >= 0) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
}

class Driver {
    public static void main(String[] args) {
        As3q1 myStack = new As3q1();

        System.out.println("Is stack empty? " + myStack.isEmpty());

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        System.out.println("Top element: " + myStack.peek());

        myStack.pop();

        System.out.println("Is stack full? " + myStack.isFull());

        myStack.pop();
        myStack.pop();
        myStack.pop();

        System.out.println("Is stack empty? " + myStack.isEmpty());
    }
}
