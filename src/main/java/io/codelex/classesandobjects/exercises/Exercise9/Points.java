package io.codelex.classesandobjects.exercises.Exercise9;

public class Points {
    private int x;
    private int y;

    public Points (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void swapPoints(Points p1, Points p2) {
        int firstPointXValue = p1.x;
        int firstPointYValue = p1.y;
        int secondPointXValue = p2.x;
        int secondPointYValue = p2.y;

        p1.x = secondPointXValue;
        p1.y = secondPointYValue;
        p2.x = firstPointXValue;
        p2.y = firstPointYValue;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Points {" +
                "x = " + x +
                ", y = " + y +
                '}';
    }
}
