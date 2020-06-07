package org.adostic.untestable.expression.good;

public class Plus extends OpNode {

    public Plus(Node left, Node right) {
        super(left, right);
    }

    public int evaluate() {
        return left.evaluate() + right.evaluate();
    }

    @Override
    public String toString() {
        return left.toString() + " + " + right.toString();
    }
}
