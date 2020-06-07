package org.adostic.untestable.expression.good;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NodeTest {
    @Test
    public void evaluate() {
        Value one = new Value(1);
        Value two = new Value(2);
        Value three = new Value(3);
        Multiply multiply = new Multiply(two, three);
        Node root = new Plus(one, multiply);

        assertEquals(7, root.evaluate());
    }

    @Test
    public void string() {
        Value one = new Value(1);
        Value two = new Value(2);
        Value three = new Value(3);
        Multiply multiply = new Multiply(two, three);
        Node root = new Plus(one, multiply);

        assertEquals("1 + 2 * 3", root.toString());
    }
}
