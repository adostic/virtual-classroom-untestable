package org.adostic.untestable.expression.good;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValueTest {

    @Test
    public void evaluate() {
        Value value = new Value(1);
        assertEquals(1, value.evaluate());
    }

    @Test
    public void string() {
        Value value = new Value(1);
        assertEquals("1", value.toString());
    }
}