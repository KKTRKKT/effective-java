package me.kktrkkt.effectivejava._10_equals.auto;

import lombok.EqualsAndHashCode;
import lombok.ToString;

// 롬복을 사용하면 가장 간단하게 생성이 가능하다.
@EqualsAndHashCode
@ToString
public class LombokPoint {

    private final int x;
    private final int y;

    public LombokPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
