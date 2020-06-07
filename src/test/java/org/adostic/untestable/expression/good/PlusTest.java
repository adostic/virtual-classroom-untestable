package org.adostic.untestable.expression.good;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlusTest {

    @Test
    public void evaluate() {
        Plus plus = new Plus(new Value(2), new Value(3));
        assertEquals(5, plus.evaluate());
    }

    @Test
    public void string() {
        Plus plus = new Plus(new Value(2), new Value(3));
        assertEquals("2 + 3", plus.toString());
    }
}