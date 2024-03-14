package me.kktrkkt.effectivejava._14_comparable._java_8;

import lombok.Getter;

@Getter
public class Point implements Comparable<Point>{

    protected final int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        int result = Integer.compare(this.x, o.x);
        if(result == 0){
            result = Integer.compare(this.y, o.y);
        }
        return result;
    }
}
