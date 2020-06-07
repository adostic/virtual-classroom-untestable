package org.adostic.untestable.example;

public class Square {
    private int side;

    public Square() {
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int area(){
        return side * side;
    }
}
