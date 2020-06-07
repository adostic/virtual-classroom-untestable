package org.adostic.untestable.expression.good;

public class Value implements Node {

    private int value;

    public Value(int value) {
        this.value = value;
    }

    public int evaluate() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
