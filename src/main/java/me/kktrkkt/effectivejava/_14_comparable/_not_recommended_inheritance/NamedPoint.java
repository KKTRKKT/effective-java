package me.kktrkkt.effectivejava._14_comparable._not_recommended_inheritance;

import lombok.Getter;

import java.util.Comparator;
import java.util.TreeSet;

@Getter
public class NamedPoint extends Point{

    private final String name;

    public NamedPoint(int x, int y, String name) {
        super(x, y);
        this.name = name;
    }

    @Override
    public String toString() {
        return "NamedPoint{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        final NamedPoint a = new NamedPoint(0, 1, "a");
        final NamedPoint b = new NamedPoint(0, 1, "b");

        TreeSet<NamedPoint> namedPoints =  new TreeSet<>(Comparator
                .comparing((NamedPoint o) -> o)
                .thenComparing(NamedPoint::getName));
        namedPoints.add(a);
        namedPoints.add(b);

        System.out.println(namedPoints);
    }
}
