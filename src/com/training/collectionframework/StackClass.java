package com.training.collectionframework;

import java.util.Stack;

public class StackClass {

    public static void main(String[] args) {

        /**
         * 🔷 What is Stack?
         * Stack is a linear data structure that follows the Last-In-First-Out (LIFO) principle.
         * That means the last element added (pushed) will be the first one removed (popped).
         *
         * 🔷 Why do we use Stack?
         * Stack is useful in situations where we need to remember the last operation
         * and undo it, or return back to a previous state.
         *
         * 🔷 Where can we use Stack in real life?
         * - Browser history (back/forward navigation)
         * - Undo/redo operations in editors (e.g., VS Code, MS Word)
         * - Expression evaluation (e.g., arithmetic expressions)
         * - Balanced parentheses check
         * - Recursion (method call stack)
         *
         * 🔷 Advantages of Stack:
         * - Easy to implement using arrays or linked lists
         * - Useful for tracking state (like navigation)
         * - Built-in in Java as java.util.Stack
         */

        // Creating a stack of type String to simulate browser history
        Stack<String> browserHistory = new Stack<>();

        // 🔹 Pushing elements (navigating to pages)
        browserHistory.push("Home Page");
        browserHistory.push("About Us");
        browserHistory.push("Services");
        browserHistory.push("Contact");

        // Displaying full stack
        System.out.println("Browser History: " + browserHistory);

        // 🔹 Peek operation: View the top element (current page)
        System.out.println("Currently viewing: " + browserHistory.peek());

        // 🔹 Pop operation: Go back one step in history
        System.out.println("Going back from: " + browserHistory.pop());
        System.out.println("Now viewing: " + browserHistory.peek());

        // 🔹 Search operation: Search for a specific page
        int position = browserHistory.search("Home Page");
        if (position != -1) {
            System.out.println("'Home Page' found at position (from top): " + position);
        } else {
            System.out.println("'Home Page' not found in history");
        }

        // 🔹 Check if the stack is empty
        System.out.println("Is browser history empty? " + browserHistory.isEmpty());

        // 🔹 Clear the stack by popping all elements
        while (!browserHistory.isEmpty()) {
            System.out.println("Closing: " + browserHistory.pop());
        }

        System.out.println("All pages closed. Is history empty now? " + browserHistory.isEmpty());
    }
}
