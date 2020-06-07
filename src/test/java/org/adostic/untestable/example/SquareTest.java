package org.adostic.untestable.example;

import org.adostic.untestable.example.Square;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {
    @Test
    public void area() {
        //given
        Square square = new Square();
        //when
        square.setSide(2);
        //then
        assertEquals(4, square.area());
    }
}