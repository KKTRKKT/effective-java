package me.kktrkkt.effectivejava._10_equals.best_practice;

public class Point {

    final int x;

    final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if (obj instanceof Point obj1) {
            return obj1.x == x && obj1.y == y;
        }

        return false;
    }
}
