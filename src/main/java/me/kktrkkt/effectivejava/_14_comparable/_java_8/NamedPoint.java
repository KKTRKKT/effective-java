package me.kktrkkt.effectivejava._14_comparable._java_8;

import lombok.Getter;
import me.kktrkkt.effectivejava._14_comparable._recommended_composition.Point;
import org.springframework.util.comparator.Comparators;

import java.util.Comparator;

@Getter
public class NamedPoint implements Comparable<NamedPoint>{

    private static final Comparator<NamedPoint> COMPARATOR = Comparator.comparing((NamedPoint p)->p.point)
            .thenComparing(NamedPoint::getName);

    private final String name;

    private final Point point;


    public NamedPoint(int x, int y, String name) {
        this.name = name;
        this.point = new Point(x, y);
    }

    @Override
    public int compareTo(NamedPoint o) {
        return COMPARATOR.compare(this, o);
    }

    public static void main(String[] args) {
        final NamedPoint a = new NamedPoint(0, 1, "a");
        final NamedPoint c = new NamedPoint(0, 1, "c");

        System.out.println(a.compareTo(c));
    }
}
