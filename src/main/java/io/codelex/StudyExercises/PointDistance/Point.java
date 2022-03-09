package io.codelex.StudyExercises.PointDistance;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static int distanceTo(Point firstPoint, Point secondPoint) {
        /*SQRT((𝑥2−𝑥1)^2+(𝑦2−𝑦1)^2)*/
        return (int) Math.sqrt(Math.pow((secondPoint.x - firstPoint.x), 2) + Math.pow((secondPoint.y - firstPoint.y), 2));
    }

    public static void main(String[] args) {
        Point p1 = new Point(-2, -4);
        Point p2 = new Point(10, 5);

        System.out.println(Point.distanceTo(p1, p2));
    }
}
