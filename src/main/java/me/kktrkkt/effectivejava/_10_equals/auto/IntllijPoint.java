package me.kktrkkt.effectivejava._10_equals.auto;

import lombok.EqualsAndHashCode;
import lombok.ToString;

// 인텔리제이 자동완성 기능을 통해 완성이 가능하다.
// 근데 내 인텔리제이는 equals 규약을 완벽하게 안지킨다.
public class IntllijPoint {

    private final int x;
    private final int y;

    public IntllijPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
