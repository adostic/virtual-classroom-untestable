package org.adostic.untestable.expression.good;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplyTest {

    @Test
    public void evaluate() {
        Multiply multiply = new Multiply(new Value(2), new Value(3));
        assertEquals(6, multiply.evaluate());
    }

    @Test
    public void string() {
        Multiply multiply = new Multiply(new Value(2), new Value(3));
        assertEquals("2 * 3", multiply.toString());
    }
}