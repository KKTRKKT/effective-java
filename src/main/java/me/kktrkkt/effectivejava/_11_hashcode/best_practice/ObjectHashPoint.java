package me.kktrkkt.effectivejava._11_hashcode.best_practice;

import java.util.Objects;

// 가장 간단한 방법으로 전통적인 방법을 유틸 클래스로 이미 구현되어 있는 Objects.hash를 사용한다.
public class ObjectHashPoint {

    private final int x;

    private final int y;

    private final Data data;

    public ObjectHashPoint(int x, int y, Data data) {
        this.x = x;
        this.y = y;
        this.data = data;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if (obj instanceof ObjectHashPoint obj1) {
            return obj1.x == x && obj1.y == y && obj1.data.equals(data);
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, data);
    }
}
