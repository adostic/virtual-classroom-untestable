package org.adostic.untestable.expression.good;

public abstract class OpNode implements Node {
    protected Node left;
    protected Node right;

    public OpNode(Node left, Node right) {
        this.left = left;
        this.right = right;
    }
}
