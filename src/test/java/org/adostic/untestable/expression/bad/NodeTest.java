package org.adostic.untestable.expression.bad;

import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {
    @Test
    public void evaluate() {
        Node one = new Node('#', 1, null, null);
        Node two = new Node('#', 2, null, null);
        Node three = new Node('#', 3, null, null);
        Node multiply = new Node('*', 0, two, three);
        Node root = new Node('+', 0, one, multiply);

        assertEquals(7, root.evaluate());
    }

    @Test
    public void string() {
        Node one = new Node('#', 1, null, null);
        Node two = new Node('#', 2, null, null);
        Node three = new Node('#', 3, null, null);
        Node multiply = new Node('*', 0, two, three);
        Node root = new Node('+', 0, one, multiply);

        assertEquals("1 + 2 * 3", root.toString());
    }
}