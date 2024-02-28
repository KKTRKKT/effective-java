package me.kktrkkt.effectivejava._10_equals.transitivity;

public class Point {

    final int x;

    final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            return ((Point) obj).x == x && ((Point) obj).y == y;
        }
        return false;
    }
}
