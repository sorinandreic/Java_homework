package org.example;

public class SquareArea {
    private int side;

    public SquareArea(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
    public int calculateArea(){
        int area = side * side;
        return area;
    };
    public void squareaArea(){
        System.out.println("Calculated square area is " + calculateArea());
    }

}

