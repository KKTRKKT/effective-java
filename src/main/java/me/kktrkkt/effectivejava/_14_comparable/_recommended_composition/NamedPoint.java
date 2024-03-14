package me.kktrkkt.effectivejava._14_comparable._recommended_composition;

import lombok.Getter;

@Getter
public class NamedPoint implements Comparable<NamedPoint>{

    private final String name;

    private final Point point;


    public NamedPoint(int x, int y, String name) {
        this.name = name;
        this.point = new Point(x, y);
    }

    @Override
    public int compareTo(NamedPoint o) {
        int result = this.point.compareTo(o.point);
        if(result == 0){
            result = this.name.compareTo(o.name);
        }
        return result;
    }

    public static void main(String[] args) {
        final NamedPoint a = new NamedPoint(0, 1, "a");
        final NamedPoint c = new NamedPoint(0, 1, "c");

        System.out.println(a.compareTo(c));
    }
}
