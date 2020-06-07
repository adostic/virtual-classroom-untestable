package org.adostic.untestable.expression.bad;

public class Node {
    private char operation;
    private int value;
    private Node left;
    private Node right;

    public Node(char operation, int value, Node left, Node right) {
        this.operation = operation;
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public int evaluate() {
        switch (operation) {
            case '#':
                return value;
            case '+':
                return left.evaluate() + right.evaluate();
            case '*':
                return left.evaluate() * right.evaluate();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public String toString() {
        switch (operation) {
            case '#':
                return String.valueOf(value);
            case '+':
                return left + " + " + right;
            case '-':
                return left + " - " + right;
            case '*':
                return left + " * " + right;
            case '/':
                return left  + " / " + right;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
