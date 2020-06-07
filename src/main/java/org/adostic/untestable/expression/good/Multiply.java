package org.adostic.untestable.expression.good;

public class Multiply extends OpNode {

    public Multiply(Node left, Node right) {
        super(left, right);
    }

    public int evaluate() {
        return left.evaluate() * right.evaluate();
    }

    @Override
    public String toString() {
        return left.toString() + " * " + right.toString();
    }
}
